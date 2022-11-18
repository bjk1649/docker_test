package org.example.controller;

import org.example.model.containerstatus.ContainerStats;
import org.example.model.containerstatus.MemoryStats;

public class Caculator {
    private ContainerStats containerStat;

    public Caculator(ContainerStats containerStats) {
        this.containerStat = containerStats;
    }

    public double calcCpuUsage() {
        long cpuTotal = containerStat.getCpuStats().getCpuUsage().getTotalUsage();
        long preCpuTotal = containerStat.getPrecpuStats().getCpuUsage().getTotalUsage();
        long systemCpuUsage = containerStat.getCpuStats().getSystemCpuUsage();
        long preSystemCpuUsage = containerStat.getPrecpuStats().getSystemCpuUsage();
        long cpuDelta = cpuTotal - preCpuTotal;
        long sysCpuDelta = systemCpuUsage - preSystemCpuUsage;

        return ((double) cpuDelta / sysCpuDelta) * containerStat.getCpuStats().getOnlineCpus() * 100;

    }

    public double calcMemoryUsage() {
        MemoryStats memoryStats = containerStat.getMemoryStats();
        long usedMemory = memoryStats.getUsage();
        long availableMemory = memoryStats.getLimit();
        return ((double) usedMemory / availableMemory) * 100;
    }


}
