package org.example.containerstatus.containerJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Mount {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("Destination")
    @Expose
    private String destination;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("RW")
    @Expose
    private Boolean rw;
    @SerializedName("Propagation")
    @Expose
    private String propagation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getRw() {
        return rw;
    }

    public void setRw(Boolean rw) {
        this.rw = rw;
    }

    public String getPropagation() {
        return propagation;
    }

    public void setPropagation(String propagation) {
        this.propagation = propagation;
    }

}
