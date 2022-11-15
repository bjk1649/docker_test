package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PidsStats {

    @SerializedName("current")
    @Expose
    private Long current;
    @SerializedName("limit")
    @Expose
    private String limit;

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public String getLimit() {
        return limit;
    }


}
