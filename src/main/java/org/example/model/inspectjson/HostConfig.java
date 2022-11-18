package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class HostConfig {

    @SerializedName("MaximumIOps")
    @Expose
    private Long maximumIOps;
    @SerializedName("MaximumIOBps")
    @Expose
    private Long maximumIOBps;
    @SerializedName("BlkioWeight")
    @Expose
    private Long blkioWeight;
    @SerializedName("BlkioWeightDevice")
    @Expose
    private List<BlkioWeightDevice> blkioWeightDevice = null;
    @SerializedName("BlkioDeviceReadBps")
    @Expose
    private List<BlkioDeviceReadBp> blkioDeviceReadBps = null;
    @SerializedName("BlkioDeviceWriteBps")
    @Expose
    private List<BlkioDeviceWriteBp> blkioDeviceWriteBps = null;
    @SerializedName("BlkioDeviceReadIOps")
    @Expose
    private List<BlkioDeviceReadIOp> blkioDeviceReadIOps = null;
    @SerializedName("BlkioDeviceWriteIOps")
    @Expose
    private List<BlkioDeviceWriteIOp> blkioDeviceWriteIOps = null;
    @SerializedName("ContainerIDFile")
    @Expose
    private String containerIDFile;
    @SerializedName("CpusetCpus")
    @Expose
    private String cpusetCpus;
    @SerializedName("CpusetMems")
    @Expose
    private String cpusetMems;
    @SerializedName("CpuPercent")
    @Expose
    private Long cpuPercent;
    @SerializedName("CpuShares")
    @Expose
    private Long cpuShares;
    @SerializedName("CpuPeriod")
    @Expose
    private Long cpuPeriod;
    @SerializedName("CpuRealtimePeriod")
    @Expose
    private Long cpuRealtimePeriod;
    @SerializedName("CpuRealtimeRuntime")
    @Expose
    private Long cpuRealtimeRuntime;
    @SerializedName("Devices")
    @Expose
    private List<Object> devices = null;
    @SerializedName("DeviceRequests")
    @Expose
    private List<DeviceRequest> deviceRequests = null;
    @SerializedName("IpcMode")
    @Expose
    private String ipcMode;
    @SerializedName("Memory")
    @Expose
    private Long memory;
    @SerializedName("MemorySwap")
    @Expose
    private Long memorySwap;
    @SerializedName("MemoryReservation")
    @Expose
    private Long memoryReservation;
    @SerializedName("KernelMemory")
    @Expose
    private Long kernelMemory;
    @SerializedName("OomKillDisable")
    @Expose
    private Boolean oomKillDisable;
    @SerializedName("OomScoreAdj")
    @Expose
    private Long oomScoreAdj;
    @SerializedName("NetworkMode")
    @Expose
    private String networkMode;
    @SerializedName("PidMode")
    @Expose
    private String pidMode;
    @SerializedName("PortBindings")
    @Expose
    private PortBindings portBindings;
    @SerializedName("Privileged")
    @Expose
    private Boolean privileged;
    @SerializedName("ReadonlyRootfs")
    @Expose
    private Boolean readonlyRootfs;
    @SerializedName("PublishAllPorts")
    @Expose
    private Boolean publishAllPorts;
    @SerializedName("RestartPolicy")
    @Expose
    private RestartPolicy restartPolicy;
    @SerializedName("LogConfig")
    @Expose
    private LogConfig logConfig;
    @SerializedName("Sysctls")
    @Expose
    private Sysctls sysctls;
    @SerializedName("Ulimits")
    @Expose
    private List<Ulimit> ulimits = null;
    @SerializedName("VolumeDriver")
    @Expose
    private String volumeDriver;
    @SerializedName("ShmSize")
    @Expose
    private Long shmSize;

    public Long getMaximumIOps() {
        return maximumIOps;
    }

    public void setMaximumIOps(Long maximumIOps) {
        this.maximumIOps = maximumIOps;
    }

    public Long getMaximumIOBps() {
        return maximumIOBps;
    }

    public void setMaximumIOBps(Long maximumIOBps) {
        this.maximumIOBps = maximumIOBps;
    }

    public Long getBlkioWeight() {
        return blkioWeight;
    }

    public void setBlkioWeight(Long blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    public List<BlkioWeightDevice> getBlkioWeightDevice() {
        return blkioWeightDevice;
    }

    public void setBlkioWeightDevice(List<BlkioWeightDevice> blkioWeightDevice) {
        this.blkioWeightDevice = blkioWeightDevice;
    }

    public List<BlkioDeviceReadBp> getBlkioDeviceReadBps() {
        return blkioDeviceReadBps;
    }

    public void setBlkioDeviceReadBps(List<BlkioDeviceReadBp> blkioDeviceReadBps) {
        this.blkioDeviceReadBps = blkioDeviceReadBps;
    }

    public List<BlkioDeviceWriteBp> getBlkioDeviceWriteBps() {
        return blkioDeviceWriteBps;
    }

    public void setBlkioDeviceWriteBps(List<BlkioDeviceWriteBp> blkioDeviceWriteBps) {
        this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    }

    public List<BlkioDeviceReadIOp> getBlkioDeviceReadIOps() {
        return blkioDeviceReadIOps;
    }

    public void setBlkioDeviceReadIOps(List<BlkioDeviceReadIOp> blkioDeviceReadIOps) {
        this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    }

    public List<BlkioDeviceWriteIOp> getBlkioDeviceWriteIOps() {
        return blkioDeviceWriteIOps;
    }

    public void setBlkioDeviceWriteIOps(List<BlkioDeviceWriteIOp> blkioDeviceWriteIOps) {
        this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    public Long getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Long cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public Long getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Long cpuShares) {
        this.cpuShares = cpuShares;
    }

    public Long getCpuPeriod() {
        return cpuPeriod;
    }

    public void setCpuPeriod(Long cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    public Long getCpuRealtimePeriod() {
        return cpuRealtimePeriod;
    }

    public void setCpuRealtimePeriod(Long cpuRealtimePeriod) {
        this.cpuRealtimePeriod = cpuRealtimePeriod;
    }

    public Long getCpuRealtimeRuntime() {
        return cpuRealtimeRuntime;
    }

    public void setCpuRealtimeRuntime(Long cpuRealtimeRuntime) {
        this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    }

    public List<Object> getDevices() {
        return devices;
    }

    public void setDevices(List<Object> devices) {
        this.devices = devices;
    }

    public List<DeviceRequest> getDeviceRequests() {
        return deviceRequests;
    }

    public void setDeviceRequests(List<DeviceRequest> deviceRequests) {
        this.deviceRequests = deviceRequests;
    }

    public String getIpcMode() {
        return ipcMode;
    }

    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Long getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(Long memorySwap) {
        this.memorySwap = memorySwap;
    }

    public Long getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(Long memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public Long getKernelMemory() {
        return kernelMemory;
    }

    public void setKernelMemory(Long kernelMemory) {
        this.kernelMemory = kernelMemory;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    public Long getOomScoreAdj() {
        return oomScoreAdj;
    }

    public void setOomScoreAdj(Long oomScoreAdj) {
        this.oomScoreAdj = oomScoreAdj;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public PortBindings getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(PortBindings portBindings) {
        this.portBindings = portBindings;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public LogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public Sysctls getSysctls() {
        return sysctls;
    }

    public void setSysctls(Sysctls sysctls) {
        this.sysctls = sysctls;
    }

    public List<Ulimit> getUlimits() {
        return ulimits;
    }

    public void setUlimits(List<Ulimit> ulimits) {
        this.ulimits = ulimits;
    }

    public String getVolumeDriver() {
        return volumeDriver;
    }

    public void setVolumeDriver(String volumeDriver) {
        this.volumeDriver = volumeDriver;
    }

    public Long getShmSize() {
        return shmSize;
    }

    public void setShmSize(Long shmSize) {
        this.shmSize = shmSize;
    }

}
