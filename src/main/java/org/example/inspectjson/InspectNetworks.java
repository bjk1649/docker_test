package org.example.inspectjson;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class InspectNetworks {


    @SerializedName("bridge")
    @Expose
    private InspectBridge bridge;

    public InspectBridge getBridge() {
        return bridge;
    }

    public void setBridge(InspectBridge bridge) {
        this.bridge = bridge;
    }


}
