package org.example.model.containerstatus.containerJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class NetworkSettings {

    @SerializedName("Networks")
    @Expose
    private NetworksJson networksJson;

    public NetworksJson getNetworksJson() {
        return networksJson;
    }

    public void setNetworks(NetworksJson networksJson) {
        this.networksJson = networksJson;
    }

}
