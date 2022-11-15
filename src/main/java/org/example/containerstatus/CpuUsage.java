package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CpuUsage {

    @SerializedName("total_usage")
    @Expose
    private Long totalUsage;
    @SerializedName("usage_in_kernelmode")
    @Expose
    private Long usageInKernelmode;
    @SerializedName("usage_in_usermode")
    @Expose
    private Long usageInUsermode;

    public Long getTotalUsage() {
        return totalUsage;
    }

    public void setTotalUsage(Long totalUsage) {
        this.totalUsage = totalUsage;
    }

    public Long getUsageInKernelmode() {
        return usageInKernelmode;
    }

    public void setUsageInKernelmode(Long usageInKernelmode) {
        this.usageInKernelmode = usageInKernelmode;
    }

    public Long getUsageInUsermode() {
        return usageInUsermode;
    }

    public void setUsageInUsermode(Long usageInUsermode) {
        this.usageInUsermode = usageInUsermode;
    }

}
