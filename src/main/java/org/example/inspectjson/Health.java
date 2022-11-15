package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Health {

    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("FailingStreak")
    @Expose
    private Long failingStreak;
    @SerializedName("Log")
    @Expose
    private List<InspectLog> inspectLog = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getFailingStreak() {
        return failingStreak;
    }

    public void setFailingStreak(Long failingStreak) {
        this.failingStreak = failingStreak;
    }

    public List<InspectLog> getLog() {
        return inspectLog;
    }

    public void setLog(List<InspectLog> inspectLog) {
        this.inspectLog = inspectLog;
    }

}
