package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Config {

    @SerializedName("AttachStderr")
    @Expose
    private Boolean attachStderr;
    @SerializedName("AttachStdin")
    @Expose
    private Boolean attachStdin;
    @SerializedName("AttachStdout")
    @Expose
    private Boolean attachStdout;
    @SerializedName("Cmd")
    @Expose
    private List<String> cmd = null;
    @SerializedName("Domainname")
    @Expose
    private String domainname;
    @SerializedName("Env")
    @Expose
    private List<String> env = null;
    @SerializedName("Healthcheck")
    @Expose
    private Healthcheck healthcheck;
    @SerializedName("Hostname")
    @Expose
    private String hostname;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Labels")
    @Expose
    private InspectLabels inspectLabels;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("NetworkDisabled")
    @Expose
    private Boolean networkDisabled;
    @SerializedName("OpenStdin")
    @Expose
    private Boolean openStdin;
    @SerializedName("StdinOnce")
    @Expose
    private Boolean stdinOnce;
    @SerializedName("Tty")
    @Expose
    private Boolean tty;
    @SerializedName("User")
    @Expose
    private String user;
    @SerializedName("Volumes")
    @Expose
    private Volumes volumes;
    @SerializedName("WorkingDir")
    @Expose
    private String workingDir;
    @SerializedName("StopSignal")
    @Expose
    private String stopSignal;
    @SerializedName("StopTimeout")
    @Expose
    private Long stopTimeout;

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(Boolean attachStderr) {
        this.attachStderr = attachStderr;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(Boolean attachStdin) {
        this.attachStdin = attachStdin;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(Boolean attachStdout) {
        this.attachStdout = attachStdout;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

    public Healthcheck getHealthcheck() {
        return healthcheck;
    }

    public void setHealthcheck(Healthcheck healthcheck) {
        this.healthcheck = healthcheck;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public InspectLabels getLabels() {
        return inspectLabels;
    }

    public void setLabels(InspectLabels inspectLabels) {
        this.inspectLabels = inspectLabels;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(Boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    public Boolean getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(Boolean openStdin) {
        this.openStdin = openStdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Volumes getVolumes() {
        return volumes;
    }

    public void setVolumes(Volumes volumes) {
        this.volumes = volumes;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
    }

    public Long getStopTimeout() {
        return stopTimeout;
    }

    public void setStopTimeout(Long stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

}
