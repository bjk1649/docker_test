package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Sysctls {

    @SerializedName("net.ipv4.ip_forward")
    @Expose
    private String netIpv4IpForward;

    public String getNetIpv4IpForward() {
        return netIpv4IpForward;
    }

    public void setNetIpv4IpForward(String netIpv4IpForward) {
        this.netIpv4IpForward = netIpv4IpForward;
    }

}
