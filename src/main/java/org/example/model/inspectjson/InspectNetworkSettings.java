package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class InspectNetworkSettings {

    @SerializedName("org.example.inspectjson.Bridge")
    @Expose
    private String bridge;
    @SerializedName("SandboxID")
    @Expose
    private String sandboxID;
    @SerializedName("HairpinMode")
    @Expose
    private Boolean hairpinMode;
    @SerializedName("LinkLocalIPv6Address")
    @Expose
    private String linkLocalIPv6Address;
    @SerializedName("LinkLocalIPv6PrefixLen")
    @Expose
    private Long linkLocalIPv6PrefixLen;
    @SerializedName("SandboxKey")
    @Expose
    private String sandboxKey;
    @SerializedName("EndpointID")
    @Expose
    private String endpointID;
    @SerializedName("Gateway")
    @Expose
    private String gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String globalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Long globalIPv6PrefixLen;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Long iPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String iPv6Gateway;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("Networks")
    @Expose
    private InspectNetworks inspectNetworks;

    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    public String getSandboxID() {
        return sandboxID;
    }

    public void setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
    }

    public Boolean getHairpinMode() {
        return hairpinMode;
    }

    public void setHairpinMode(Boolean hairpinMode) {
        this.hairpinMode = hairpinMode;
    }

    public String getLinkLocalIPv6Address() {
        return linkLocalIPv6Address;
    }

    public void setLinkLocalIPv6Address(String linkLocalIPv6Address) {
        this.linkLocalIPv6Address = linkLocalIPv6Address;
    }

    public Long getLinkLocalIPv6PrefixLen() {
        return linkLocalIPv6PrefixLen;
    }

    public void setLinkLocalIPv6PrefixLen(Long linkLocalIPv6PrefixLen) {
        this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
    }

    public String getSandboxKey() {
        return sandboxKey;
    }

    public void setSandboxKey(String sandboxKey) {
        this.sandboxKey = sandboxKey;
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

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public InspectNetworks getNetworks() {
        return inspectNetworks;
    }

    public void setNetworks(InspectNetworks inspectNetworks) {
        this.inspectNetworks = inspectNetworks;
    }

}
