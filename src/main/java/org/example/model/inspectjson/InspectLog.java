package org.example.model.inspectjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class InspectLog {

    @SerializedName("Start")
    @Expose
    private String start;
    @SerializedName("End")
    @Expose
    private String end;
    @SerializedName("ExitCode")
    @Expose
    private Long exitCode;
    @SerializedName("Output")
    @Expose
    private String output;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getExitCode() {
        return exitCode;
    }

    public void setExitCode(Long exitCode) {
        this.exitCode = exitCode;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

}
