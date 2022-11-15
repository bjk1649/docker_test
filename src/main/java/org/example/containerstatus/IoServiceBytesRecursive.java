package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class IoServiceBytesRecursive {

    @SerializedName("major")
    @Expose
    private Long major;
    @SerializedName("minor")
    @Expose
    private Long minor;
    @SerializedName("op")
    @Expose
    private String op;
    @SerializedName("value")
    @Expose
    private Long value;

    public Long getMajor() {
        return major;
    }

    public void setMajor(Long major) {
        this.major = major;
    }

    public Long getMinor() {
        return minor;
    }

    public void setMinor(Long minor) {
        this.minor = minor;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

}
