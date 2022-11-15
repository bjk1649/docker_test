package org.example.controller;

import com.google.gson.Gson;
import com.sun.management.OperatingSystemMXBean;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import org.example.containerstatus.ContainerStats;
import org.example.containerstatus.Eth0;
import org.example.containerstatus.containerJson.ContainerStat;
import org.example.inspectjson.ContainerInspect;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Docker {

    public void run() throws IOException {
        Cmd cmd = new Cmd();
        Gson gson = new Gson();
        JSONParser parser = new JSONParser();
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        BufferedWriter writer = new BufferedWriter(new FileWriter("./dockerJava.txt", true));

        while (true) {
            try {

                Thread.sleep(3000);
                String command = cmd.inputCommand(
                        "curl -s --unix-socket /var/run/docker.sock http://v1.41/containers/json");
                String result = cmd.execCommand(command);
                ContainerStat[] containerJsons = gson.fromJson(result, ContainerStat[].class);
                JSONArray jsonArray = (JSONArray) parser.parse(result);
                int totalUsingCpus = 0;
                int numberOfContainer = jsonArray.size();
                long hostMemory = osBean.getTotalPhysicalMemorySize();
                long hostCpu = Runtime.getRuntime().availableProcessors() * 100;
                long hostAvailableMemory = osBean.getFreePhysicalMemorySize();
                writer.write("{\"running_container_numbers\": " + numberOfContainer);
                writer.write("\n\"host_memory\": \"" + (hostMemory/1000000)+ "MB\"");
                writer.write("\n\"host_cpu\": \"" + hostCpu +"%\"\n[\n");
                System.out.println("{\"running_container_numbers\": " + numberOfContainer);
                System.out.println("\"host_memory\": \"" + (hostMemory/1000000)+ "MB\"");
                System.out.println("\"host_cpu\": \"" + hostCpu +"%\"");
                System.out.println("[");
                writer.flush();

                for (ContainerStat containerJson : containerJsons) {
                    String ip = containerJson.getNetworkSettings().getNetworksJson().getBridge().getIPAddress();
                    writer.write("{\"container_ip\": " + ip);
                    System.out.println("{\"container_ip\": " + ip);
                    String conId = containerJson.getId();

                    String tmpInspectCmd = String.format(
                            "curl -s --unix-socket /var/run/docker.sock http://v1.41/containers/%s/json", conId);
                    String tmpStatCmd = String.format(
                            "curl -s --unix-socket /var/run/docker.sock http://v1.41/containers/%s/stats?stream=false",
                            conId);
                    String inspectCmd = cmd.inputCommand(tmpInspectCmd);
                    String statCommand = cmd.inputCommand(tmpStatCmd);
                    String inspectResult = cmd.execCommand(inspectCmd);
                    String statResult = cmd.execCommand(statCommand);

                    JSONObject stateObject = (JSONObject) parser.parse(inspectResult);
                    ContainerInspect containerInspect = gson.fromJson(statResult, ContainerInspect.class);
                    ContainerStats containerStats = gson.fromJson(statResult, ContainerStats.class);

                    Caculator caculator = new Caculator(containerStats);
                    long pid = containerStats.getPidsStats().getCurrent();
                    long maxMemory = containerStats.getMemoryStats().getLimit(); // 할당된 메모리 크기
                    long cpuNum = containerStats.getCpuStats().getOnlineCpus(); // 할당된 cpu 개수
                    totalUsingCpus += cpuNum;
                    long memoryUsage = containerStats.getMemoryStats().getUsage();
                    double memoryUsagePercent = caculator.calcMemoryUsage();
                    double cpuUsage = caculator.calcCpuUsage();


                    Eth0 eth0 = containerStats.getNetworks().getEth0();
                    long rxBytes = eth0.getRxBytes();
                    long rxPackets = eth0.getRxPackets();
                    long txBytes = eth0.getTxBytes();
                    long txPackets = eth0.getTxPackets();

                    writer.write("\n\"pid\": "+ pid);
                    System.out.println("\"pid\": "+ pid);
                    writer.write("\n\"container_cpu_Num\": " + cpuNum);
                    System.out.println("\"container_cpu_Num\": " + cpuNum);
                    writer.write("\n\"container_memory\": \""+ maxMemory/1000000 + "MB\"");
                    System.out.println("\"container_memory\": \""+ maxMemory/1000000 + "MB\"");
                    writer.write("\n\"cpu_usage\": \"" + cpuUsage + "%\"");
                    System.out.println("\"cpu_usage\": \"" + cpuUsage + "%\"");
                    writer.write("\n\"memory_usage\": \"" + memoryUsage/1000000 + "MB\"");
                    System.out.println("\"memory_usage\": \"" + memoryUsage/1000000 + "MB\"");
                    writer.write("\n\"memory_usage_percent\": \""+ memoryUsagePercent + "%\"");
                    System.out.println("\"memory_usage_percent\": \""+ memoryUsagePercent + "%\"");
                    writer.write("\n\"rx_bytes\": "+rxBytes);
                    System.out.println("\"rx_bytes\": "+rxBytes);
                    writer.write("\n\"rx_packets\": "+rxPackets);
                    System.out.println("\"rx_packets\": "+rxPackets);
                    writer.write("\n\"tx_bytes\": "+txBytes);
                    System.out.println("\"tx_bytes\": "+txBytes);
                    writer.write("\n\"tx_packets\": "+txPackets);
                    System.out.print("\"tx_packets\": "+txPackets);
                    writer.write("}\n");
                    System.out.println("}");
                    writer.flush();

                }
                writer.write("\n]\n\"host_available_memory\": \"" +hostAvailableMemory/1000000+ "MB\"");
                System.out.println("]\n\"host_available_memory\": \"" +hostAvailableMemory/1000000+ "MB\"");
                writer.write("\n\"host_available_cpu\": \"" + (hostCpu-totalUsingCpus*100) +"%\"}\n\n\n\n");
                System.out.println("\"host_available_cpu\": \"" + (hostCpu-totalUsingCpus*100) +"%\"}");
                writer.flush();
            } catch (Exception e) {

            }
        }
    }
}