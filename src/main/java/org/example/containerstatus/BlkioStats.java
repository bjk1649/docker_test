package org.example.containerstatus;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BlkioStats {

    @SerializedName("io_service_bytes_recursive")
    @Expose
    private List<IoServiceBytesRecursive> ioServiceBytesRecursive = null;
    @SerializedName("io_serviced_recursive")
    @Expose
    private Object ioServicedRecursive;
    @SerializedName("io_queue_recursive")
    @Expose
    private Object ioQueueRecursive;
    @SerializedName("io_service_time_recursive")
    @Expose
    private Object ioServiceTimeRecursive;
    @SerializedName("io_wait_time_recursive")
    @Expose
    private Object ioWaitTimeRecursive;
    @SerializedName("io_merged_recursive")
    @Expose
    private Object ioMergedRecursive;
    @SerializedName("io_time_recursive")
    @Expose
    private Object ioTimeRecursive;
    @SerializedName("sectors_recursive")
    @Expose
    private Object sectorsRecursive;

    public List<IoServiceBytesRecursive> getIoServiceBytesRecursive() {
        return ioServiceBytesRecursive;
    }

    public void setIoServiceBytesRecursive(List<IoServiceBytesRecursive> ioServiceBytesRecursive) {
        this.ioServiceBytesRecursive = ioServiceBytesRecursive;
    }

    public Object getIoServicedRecursive() {
        return ioServicedRecursive;
    }

    public void setIoServicedRecursive(Object ioServicedRecursive) {
        this.ioServicedRecursive = ioServicedRecursive;
    }

    public Object getIoQueueRecursive() {
        return ioQueueRecursive;
    }

    public void setIoQueueRecursive(Object ioQueueRecursive) {
        this.ioQueueRecursive = ioQueueRecursive;
    }

    public Object getIoServiceTimeRecursive() {
        return ioServiceTimeRecursive;
    }

    public void setIoServiceTimeRecursive(Object ioServiceTimeRecursive) {
        this.ioServiceTimeRecursive = ioServiceTimeRecursive;
    }

    public Object getIoWaitTimeRecursive() {
        return ioWaitTimeRecursive;
    }

    public void setIoWaitTimeRecursive(Object ioWaitTimeRecursive) {
        this.ioWaitTimeRecursive = ioWaitTimeRecursive;
    }

    public Object getIoMergedRecursive() {
        return ioMergedRecursive;
    }

    public void setIoMergedRecursive(Object ioMergedRecursive) {
        this.ioMergedRecursive = ioMergedRecursive;
    }

    public Object getIoTimeRecursive() {
        return ioTimeRecursive;
    }

    public void setIoTimeRecursive(Object ioTimeRecursive) {
        this.ioTimeRecursive = ioTimeRecursive;
    }

    public Object getSectorsRecursive() {
        return sectorsRecursive;
    }

    public void setSectorsRecursive(Object sectorsRecursive) {
        this.sectorsRecursive = sectorsRecursive;
    }

}