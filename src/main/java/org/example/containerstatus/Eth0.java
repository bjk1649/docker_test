package org.example.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Eth0 {

    @SerializedName("rx_bytes")
    @Expose
    private Long rxBytes;
    @SerializedName("rx_packets")
    @Expose
    private Long rxPackets;
    @SerializedName("rx_errors")
    @Expose
    private Long rxErrors;
    @SerializedName("rx_dropped")
    @Expose
    private Long rxDropped;
    @SerializedName("tx_bytes")
    @Expose
    private Long txBytes;
    @SerializedName("tx_packets")
    @Expose
    private Long txPackets;
    @SerializedName("tx_errors")
    @Expose
    private Long txErrors;
    @SerializedName("tx_dropped")
    @Expose
    private Long txDropped;

    public Long getRxBytes() {
        return rxBytes;
    }

    public void setRxBytes(Long rxBytes) {
        this.rxBytes = rxBytes;
    }

    public Long getRxPackets() {
        return rxPackets;
    }

    public void setRxPackets(Long rxPackets) {
        this.rxPackets = rxPackets;
    }

    public Long getRxErrors() {
        return rxErrors;
    }

    public void setRxErrors(Long rxErrors) {
        this.rxErrors = rxErrors;
    }

    public Long getRxDropped() {
        return rxDropped;
    }

    public void setRxDropped(Long rxDropped) {
        this.rxDropped = rxDropped;
    }

    public Long getTxBytes() {
        return txBytes;
    }

    public void setTxBytes(Long txBytes) {
        this.txBytes = txBytes;
    }

    public Long getTxPackets() {
        return txPackets;
    }

    public void setTxPackets(Long txPackets) {
        this.txPackets = txPackets;
    }

    public Long getTxErrors() {
        return txErrors;
    }

    public void setTxErrors(Long txErrors) {
        this.txErrors = txErrors;
    }

    public Long getTxDropped() {
        return txDropped;
    }

    public void setTxDropped(Long txDropped) {
        this.txDropped = txDropped;
    }

}
