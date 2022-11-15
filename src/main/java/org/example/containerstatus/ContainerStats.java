package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;
import org.example.containerstatus.containerJson.NetworksJson;

@Generated("jsonschema2pojo")
public class ContainerStats {

    @SerializedName("read")
    @Expose
    private String read;
    @SerializedName("preread")
    @Expose
    private String preread;
    @SerializedName("pids_stats")
    @Expose
    private PidsStats pidsStats;
    @SerializedName("blkio_stats")
    @Expose
    private BlkioStats blkioStats;
    @SerializedName("num_procs")
    @Expose
    private Long numProcs;
    @SerializedName("storage_stats")
    @Expose
    private StorageStats storageStats;
    @SerializedName("cpu_stats")
    @Expose
    private CpuStats cpuStats;
    @SerializedName("precpu_stats")
    @Expose
    private PrecpuStats precpuStats;
    @SerializedName("memory_stats")
    @Expose
    private MemoryStats memoryStats;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("networks")
    @Expose
    private Networks networks;

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getPreread() {
        return preread;
    }

    public void setPreread(String preread) {
        this.preread = preread;
    }

    public PidsStats getPidsStats() {
        return pidsStats;
    }

    public void setPidsStats(PidsStats pidsStats) {
        this.pidsStats = pidsStats;
    }

    public BlkioStats getBlkioStats() {
        return blkioStats;
    }

    public void setBlkioStats(BlkioStats blkioStats) {
        this.blkioStats = blkioStats;
    }

    public Long getNumProcs() {
        return numProcs;
    }

    public void setNumProcs(Long numProcs) {
        this.numProcs = numProcs;
    }

    public StorageStats getStorageStats() {
        return storageStats;
    }

    public void setStorageStats(StorageStats storageStats) {
        this.storageStats = storageStats;
    }

    public CpuStats getCpuStats() {
        return cpuStats;
    }

    public void setCpuStats(CpuStats cpuStats) {
        this.cpuStats = cpuStats;
    }

    public PrecpuStats getPrecpuStats() {
        return precpuStats;
    }

    public void setPrecpuStats(PrecpuStats precpuStats) {
        this.precpuStats = precpuStats;
    }

    public MemoryStats getMemoryStats() {
        return memoryStats;
    }

    public void setMemoryStats(MemoryStats memoryStats) {
        this.memoryStats = memoryStats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Networks getNetworks() {
        return networks;
    }

    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

}
