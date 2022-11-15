package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Networks {

    @SerializedName("eth0")
    @Expose
    private Eth0 eth0;

    public Eth0 getEth0() {
        return eth0;
    }

    public void setEth0(Eth0 eth0) {
        this.eth0 = eth0;
    }

}
