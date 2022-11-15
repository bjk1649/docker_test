package org.example.containerstatus.containerJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Labels {

    @SerializedName("com.example.vendor")
    @Expose
    private String comExampleVendor;
    @SerializedName("com.example.license")
    @Expose
    private String comExampleLicense;
    @SerializedName("com.example.version")
    @Expose
    private String comExampleVersion;

    public String getComExampleVendor() {
        return comExampleVendor;
    }

    public void setComExampleVendor(String comExampleVendor) {
        this.comExampleVendor = comExampleVendor;
    }

    public String getComExampleLicense() {
        return comExampleLicense;
    }

    public void setComExampleLicense(String comExampleLicense) {
        this.comExampleLicense = comExampleLicense;
    }

    public String getComExampleVersion() {
        return comExampleVersion;
    }

    public void setComExampleVersion(String comExampleVersion) {
        this.comExampleVersion = comExampleVersion;
    }

}
