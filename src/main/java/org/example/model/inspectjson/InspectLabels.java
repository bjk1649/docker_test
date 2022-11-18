package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class InspectLabels {

    @SerializedName("vendor")
    @Expose
    private String comExampleVendor;
    @SerializedName("license")
    @Expose
    private String comExampleLicense;
    @SerializedName("version")
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
