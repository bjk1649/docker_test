package org.example.model.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CpuStats {

    @SerializedName("cpu_usage")
    @Expose
    private CpuUsage cpuUsage;
    @SerializedName("system_cpu_usage")
    @Expose
    private Long systemCpuUsage;
    @SerializedName("online_cpus")
    @Expose
    private Long onlineCpus;
    @SerializedName("throttling_data")
    @Expose
    private ThrottlingData throttlingData;

    public CpuUsage getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(CpuUsage cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Long getSystemCpuUsage() {
        return systemCpuUsage;
    }

    public void setSystemCpuUsage(Long systemCpuUsage) {
        this.systemCpuUsage = systemCpuUsage;
    }

    public Long getOnlineCpus() {
        return onlineCpus;
    }

    public void setOnlineCpus(Long onlineCpus) {
        this.onlineCpus = onlineCpus;
    }

    public ThrottlingData getThrottlingData() {
        return throttlingData;
    }

    public void setThrottlingData(ThrottlingData throttlingData) {
        this.throttlingData = throttlingData;
    }

}
