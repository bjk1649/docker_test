package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class State {

    @SerializedName("Error")
    @Expose
    private String error;
    @SerializedName("ExitCode")
    @Expose
    private Long exitCode;
    @SerializedName("FinishedAt")
    @Expose
    private String finishedAt;
    @SerializedName("Health")
    @Expose
    private Health health;
    @SerializedName("OOMKilled")
    @Expose
    private Boolean oOMKilled;
    @SerializedName("Dead")
    @Expose
    private Boolean dead;
    @SerializedName("Paused")
    @Expose
    private Boolean paused;
    @SerializedName("Pid")
    @Expose
    private Long pid;
    @SerializedName("Restarting")
    @Expose
    private Boolean restarting;
    @SerializedName("Running")
    @Expose
    private Boolean running;
    @SerializedName("StartedAt")
    @Expose
    private String startedAt;
    @SerializedName("Status")
    @Expose
    private String status;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Long getExitCode() {
        return exitCode;
    }

    public void setExitCode(Long exitCode) {
        this.exitCode = exitCode;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Boolean getOOMKilled() {
        return oOMKilled;
    }

    public void setOOMKilled(Boolean oOMKilled) {
        this.oOMKilled = oOMKilled;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Boolean getRestarting() {
        return restarting;
    }

    public void setRestarting(Boolean restarting) {
        this.restarting = restarting;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
