package org.example.controller;

import com.google.gson.Gson;
import com.sun.management.OperatingSystemMXBean;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import org.example.model.containerstatus.ContainerStats;
import org.example.model.containerstatus.Eth0;
import org.example.model.containerstatus.containerJson.ContainerStat;
import org.example.model.inspectjson.ContainerInspect;

public class Docker {

    public void run() throws IOException {
        Cmd cmd = new Cmd();
        Gson gson = new Gson();
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        BufferedWriter writer = new BufferedWriter(new FileWriter("./dockerJava.txt", true)); // 프로젝트 루트 디렉토리에 로그 작성

        while (true) {
            try {

                Thread.sleep(2000);
                String command = cmd.inputCommand(
                        "curl -s --unix-socket /var/run/docker.sock http://v1.41/containers/json");
                String result = cmd.execCommand(command);
                ContainerStat[] containerJsons = gson.fromJson(result, ContainerStat[].class);
                int numberOfContainer = containerJsons.length;
                long hostMemory = osBean.getTotalMemorySize();
                long hostFreeMemory = osBean.getFreeMemorySize();
                long hostCpu = Runtime.getRuntime().availableProcessors() * 100;
                double hostCpuUsage = osBean.getSystemCpuLoad() * hostCpu;
                writer.write("\n\n\n-----------\n");
                writer.write("{\"running_container_numbers\": " + numberOfContainer);
                writer.write(",\n\"host_memory\": \"" + (hostMemory / 1000000) + "MB\"");
                writer.write(",\n\"host_cpu\": \"" + hostCpu + "%\",\n");
                writer.write("\"containers\": [");
                System.out.println("\n\n\n-----------");
                System.out.println("{\"running_container_numbers\": " + numberOfContainer);
                System.out.println(",\"host_memory\": \"" + (hostMemory / 1000000) + "MB\"");
                System.out.println(",\"host_cpu\": \"" + hostCpu + "%\"");
                System.out.println("\"containers: \"[");
                writer.flush();

                for (ContainerStat containerJson : containerJsons) {
                    String ip = containerJson.getNetworkSettings().getNetworksJson().getBridge().getIPAddress();
                    writer.write("{\"container_ip\": \"" + ip+"\"");
                    System.out.println("{\"container_ip\": \"" + ip+"\"");
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

                    ContainerInspect containerInspect = gson.fromJson(inspectResult, ContainerInspect.class);
                    ContainerStats containerStats = gson.fromJson(statResult, ContainerStats.class);

                    Caculator caculator = new Caculator(containerStats); // 메모리와 cpu 사용량을 계산해주는 클래스
                    long pid = containerInspect.getState().getPid(); //pid
                    long maxMemory = containerStats.getMemoryStats().getLimit(); // 할당된 메모리 크기
                    long cpuNum = containerStats.getCpuStats().getOnlineCpus(); // 할당된 cpu 개수
                    long memoryUsage = containerStats.getMemoryStats().getUsage(); // 컨테이너가 사용중인 메모리
                    double memoryUsagePercent = caculator.calcMemoryUsage(); // 컨테이너가 사용중인 메모리 %
                    double cpuUsage = caculator.calcCpuUsage(); // 컨테이너가 사용중인 cpu %

                    Eth0 eth0 = containerStats.getNetworks().getEth0();
                    long rxBytes = eth0.getRxBytes();
                    long rxPackets = eth0.getRxPackets();
                    long txBytes = eth0.getTxBytes();
                    long txPackets = eth0.getTxPackets();

                    writer.write(",\n\"pid\": " + pid);
                    System.out.println(",\"pid\": " + pid);
                    writer.write(",\n\"container_cpu_Num\": " + cpuNum);
                    System.out.println(",\"container_cpu_Num\": " + cpuNum);
                    writer.write(",\n\"container_memory\": \"" + maxMemory / 1000000 + "MB\"");
                    System.out.println(",\"container_memory\": \"" + maxMemory / 1000000 + "MB\"");
                    writer.write(",\n\"cpu_usage\": \"" + cpuUsage + "%\"");
                    System.out.println(",\"cpu_usage\": \"" + cpuUsage + "%\"");
                    writer.write(",\n\"memory_usage\": \"" + memoryUsage / 1000000 + "MB\"");
                    System.out.println(",\"memory_usage\": \"" + memoryUsage / 1000000 + "MB\"");
                    writer.write(",\n\"memory_usage_percent\": \"" + memoryUsagePercent + "%\"");
                    System.out.println(",\"memory_usage_percent\": \"" + memoryUsagePercent + "%\"");
                    writer.write(",\n\"rx_bytes\": " + rxBytes);
                    System.out.println(",\"rx_bytes\": " + rxBytes);
                    writer.write(",\n\"rx_packets\": " + rxPackets);
                    System.out.println(",\"rx_packets\": " + rxPackets);
                    writer.write(",\n\"tx_bytes\": " + txBytes);
                    System.out.println(",\"tx_bytes\": " + txBytes);
                    writer.write(",\n\"tx_packets\": " + txPackets);
                    System.out.print(",\"tx_packets\": " + txPackets);
                    writer.write("},\n");
                    System.out.println("},");
                    writer.flush();

                }
                writer.write("\n],\n\"host_available_memory\": \"" + hostFreeMemory / 1000000 + "MB\"");
                System.out.println("],\n\"host_available_memory\": \"" + hostFreeMemory / 1000000 + "MB\"");
                writer.write(",\n\"host_available_cpu\": \"" + (hostCpu - hostCpuUsage) + "%\"}\n\n\n\n");
                System.out.println(",\"host_available_cpu\": \"" + (hostCpu - hostCpuUsage) + "%\"}\n\n\n\n");
                writer.flush();
            } catch (Exception e) {

            }
        }
    }
}
