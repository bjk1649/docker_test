package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class DeviceRequest {

    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Count")
    @Expose
    private Long count;
    @SerializedName("DeviceIDs")
    @Expose
    private List<String> deviceIDs = null;
    @SerializedName("Capabilities")
    @Expose
    private List<List<String>> capabilities = null;
    @SerializedName("Options")
    @Expose
    private Options options;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<String> getDeviceIDs() {
        return deviceIDs;
    }

    public void setDeviceIDs(List<String> deviceIDs) {
        this.deviceIDs = deviceIDs;
    }

    public List<List<String>> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<List<String>> capabilities) {
        this.capabilities = capabilities;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

}
