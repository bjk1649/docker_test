package org.example.model.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class MemoryStats {

    @SerializedName("usage")
    @Expose
    private Long usage;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("limit")
    @Expose
    private Long limit;

    public Long getUsage() {
        return usage;
    }

    public void setUsage(Long usage) {
        this.usage = usage;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

}
