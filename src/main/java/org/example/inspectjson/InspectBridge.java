package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class InspectBridge {

    @SerializedName("NetworkID")
    @Expose
    private String networkID;
    @SerializedName("EndpointID")
    @Expose
    private String endpointID;
    @SerializedName("Gateway")
    @Expose
    private String gateway;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Long iPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String iPv6Gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String globalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Long globalIPv6PrefixLen;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    public String getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(String endpointID) {
        this.endpointID = endpointID;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    public Long getIPPrefixLen() {
        return iPPrefixLen;
    }

    public void setIPPrefixLen(Long iPPrefixLen) {
        this.iPPrefixLen = iPPrefixLen;
    }

    public String getIPv6Gateway() {
        return iPv6Gateway;
    }

    public void setIPv6Gateway(String iPv6Gateway) {
        this.iPv6Gateway = iPv6Gateway;
    }

    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    public void setGlobalIPv6Address(String globalIPv6Address) {
        this.globalIPv6Address = globalIPv6Address;
    }

    public Long getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

}
