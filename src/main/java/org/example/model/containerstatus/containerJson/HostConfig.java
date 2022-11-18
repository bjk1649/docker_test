package org.example.model.containerstatus.containerJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class HostConfig {

    @SerializedName("NetworkMode")
    @Expose
    private String networkMode;

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

}
