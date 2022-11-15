
package org.example.containerstatus.containerJson;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Port {

    @SerializedName("PrivatePort")
    @Expose
    private Long privatePort;
    @SerializedName("PublicPort")
    @Expose
    private Long publicPort;
    @SerializedName("Type")
    @Expose
    private String type;

    public Long getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(Long privatePort) {
        this.privatePort = privatePort;
    }

    public Long getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(Long publicPort) {
        this.publicPort = publicPort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}