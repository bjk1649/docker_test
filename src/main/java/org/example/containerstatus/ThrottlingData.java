package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ThrottlingData {

    @SerializedName("periods")
    @Expose
    private Long periods;
    @SerializedName("throttled_periods")
    @Expose
    private Long throttledPeriods;
    @SerializedName("throttled_time")
    @Expose
    private Long throttledTime;

    public Long getPeriods() {
        return periods;
    }

    public void setPeriods(Long periods) {
        this.periods = periods;
    }

    public Long getThrottledPeriods() {
        return throttledPeriods;
    }

    public void setThrottledPeriods(Long throttledPeriods) {
        this.throttledPeriods = throttledPeriods;
    }

    public Long getThrottledTime() {
        return throttledTime;
    }

    public void setThrottledTime(Long throttledTime) {
        this.throttledTime = throttledTime;
    }

}
