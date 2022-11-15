package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class RestartPolicy {

    @SerializedName("MaximumRetryCount")
    @Expose
    private Long maximumRetryCount;
    @SerializedName("Name")
    @Expose
    private String name;

    public Long getMaximumRetryCount() {
        return maximumRetryCount;
    }

    public void setMaximumRetryCount(Long maximumRetryCount) {
        this.maximumRetryCount = maximumRetryCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
