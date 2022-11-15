package org.example.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Volumes {

    @SerializedName("/volumes/data")
    @Expose
    private VolumesData volumesData;

    public VolumesData getVolumesData() {
        return volumesData;
    }

    public void setVolumesData(VolumesData volumesData) {
        this.volumesData = volumesData;
    }

}
