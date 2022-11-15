package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ContainerInspect {

    @SerializedName("AppArmorProfile")
    @Expose
    private String appArmorProfile;
    @SerializedName("Args")
    @Expose
    private List<String> args = null;
    @SerializedName("Config")
    @Expose
    private Config config;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("ExecIDs")
    @Expose
    private List<String> execIDs = null;
    @SerializedName("HostConfig")
    @Expose
    private HostConfig hostConfig;
    @SerializedName("HostnamePath")
    @Expose
    private String hostnamePath;
    @SerializedName("HostsPath")
    @Expose
    private String hostsPath;
    @SerializedName("LogPath")
    @Expose
    private String logPath;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("MountLabel")
    @Expose
    private String mountLabel;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("NetworkSettings")
    @Expose
    private InspectNetworkSettings inspectNetworkSettings;
    @SerializedName("Path")
    @Expose
    private String path;
    @SerializedName("ProcessLabel")
    @Expose
    private String processLabel;
    @SerializedName("ResolvConfPath")
    @Expose
    private String resolvConfPath;
    @SerializedName("RestartCount")
    @Expose
    private Long restartCount;
    @SerializedName("State")
    @Expose
    private State state;
    @SerializedName("Mounts")
    @Expose
    private List<InspectMount> mounts = null;

    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    public void setAppArmorProfile(String appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public List<String> getExecIDs() {
        return execIDs;
    }

    public void setExecIDs(List<String> execIDs) {
        this.execIDs = execIDs;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    public String getHostnamePath() {
        return hostnamePath;
    }

    public void setHostnamePath(String hostnamePath) {
        this.hostnamePath = hostnamePath;
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public void setHostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMountLabel() {
        return mountLabel;
    }

    public void setMountLabel(String mountLabel) {
        this.mountLabel = mountLabel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InspectNetworkSettings getNetworkSettings() {
        return inspectNetworkSettings;
    }

    public void setNetworkSettings(InspectNetworkSettings inspectNetworkSettings) {
        this.inspectNetworkSettings = inspectNetworkSettings;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(String processLabel) {
        this.processLabel = processLabel;
    }

    public String getResolvConfPath() {
        return resolvConfPath;
    }

    public void setResolvConfPath(String resolvConfPath) {
        this.resolvConfPath = resolvConfPath;
    }

    public Long getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Long restartCount) {
        this.restartCount = restartCount;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<InspectMount> getMounts() {
        return mounts;
    }

    public void setMounts(List<InspectMount> mounts) {
        this.mounts = mounts;
    }

}
