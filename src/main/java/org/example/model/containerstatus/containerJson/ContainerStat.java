package org.example.model.containerstatus.containerJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ContainerStat {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Names")
    @Expose
    private List<String> names = null;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("ImageID")
    @Expose
    private String imageID;
    @SerializedName("Command")
    @Expose
    private String command;
    @SerializedName("Created")
    @Expose
    private Long created;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Ports")
    @Expose
    private List<Port> ports = null;
    @SerializedName("Labels")
    @Expose
    private Labels labels;
    @SerializedName("SizeRw")
    @Expose
    private Long sizeRw;
    @SerializedName("SizeRootFs")
    @Expose
    private Long sizeRootFs;
    @SerializedName("HostConfig")
    @Expose
    private HostConfig hostConfig;
    @SerializedName("NetworkSettings")
    @Expose
    private NetworkSettings networkSettings;
    @SerializedName("Mounts")
    @Expose
    private List<Mount> mounts = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Long getSizeRw() {
        return sizeRw;
    }

    public void setSizeRw(Long sizeRw) {
        this.sizeRw = sizeRw;
    }

    public Long getSizeRootFs() {
        return sizeRootFs;
    }

    public void setSizeRootFs(Long sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public void setNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

}
