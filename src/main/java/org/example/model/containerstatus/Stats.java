package org.example.model.containerstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Stats {

    @SerializedName("active_anon")
    @Expose
    private Long activeAnon;
    @SerializedName("active_file")
    @Expose
    private Long activeFile;
    @SerializedName("anon")
    @Expose
    private Long anon;
    @SerializedName("anon_thp")
    @Expose
    private Long anonThp;
    @SerializedName("file")
    @Expose
    private Long file;
    @SerializedName("file_dirty")
    @Expose
    private Long fileDirty;
    @SerializedName("file_mapped")
    @Expose
    private Long fileMapped;
    @SerializedName("file_writeback")
    @Expose
    private Long fileWriteback;
    @SerializedName("inactive_anon")
    @Expose
    private Long inactiveAnon;
    @SerializedName("inactive_file")
    @Expose
    private Long inactiveFile;
    @SerializedName("kernel_stack")
    @Expose
    private Long kernelStack;
    @SerializedName("pgactivate")
    @Expose
    private Long pgactivate;
    @SerializedName("pgdeactivate")
    @Expose
    private Long pgdeactivate;
    @SerializedName("pgfault")
    @Expose
    private Long pgfault;
    @SerializedName("pglazyfree")
    @Expose
    private Long pglazyfree;
    @SerializedName("pglazyfreed")
    @Expose
    private Long pglazyfreed;
    @SerializedName("pgmajfault")
    @Expose
    private Long pgmajfault;
    @SerializedName("pgrefill")
    @Expose
    private Long pgrefill;
    @SerializedName("pgscan")
    @Expose
    private Long pgscan;
    @SerializedName("pgsteal")
    @Expose
    private Long pgsteal;
    @SerializedName("shmem")
    @Expose
    private Long shmem;
    @SerializedName("slab")
    @Expose
    private Long slab;
    @SerializedName("slab_reclaimable")
    @Expose
    private Long slabReclaimable;
    @SerializedName("slab_unreclaimable")
    @Expose
    private Long slabUnreclaimable;
    @SerializedName("sock")
    @Expose
    private Long sock;
    @SerializedName("thp_collapse_alloc")
    @Expose
    private Long thpCollapseAlloc;
    @SerializedName("thp_fault_alloc")
    @Expose
    private Long thpFaultAlloc;
    @SerializedName("unevictable")
    @Expose
    private Long unevictable;
    @SerializedName("workingset_activate")
    @Expose
    private Long workingsetActivate;
    @SerializedName("workingset_nodereclaim")
    @Expose
    private Long workingsetNodereclaim;
    @SerializedName("workingset_refault")
    @Expose
    private Long workingsetRefault;

    public Long getActiveAnon() {
        return activeAnon;
    }

    public void setActiveAnon(Long activeAnon) {
        this.activeAnon = activeAnon;
    }

    public Long getActiveFile() {
        return activeFile;
    }

    public void setActiveFile(Long activeFile) {
        this.activeFile = activeFile;
    }

    public Long getAnon() {
        return anon;
    }

    public void setAnon(Long anon) {
        this.anon = anon;
    }

    public Long getAnonThp() {
        return anonThp;
    }

    public void setAnonThp(Long anonThp) {
        this.anonThp = anonThp;
    }

    public Long getFile() {
        return file;
    }

    public void setFile(Long file) {
        this.file = file;
    }

    public Long getFileDirty() {
        return fileDirty;
    }

    public void setFileDirty(Long fileDirty) {
        this.fileDirty = fileDirty;
    }

    public Long getFileMapped() {
        return fileMapped;
    }

    public void setFileMapped(Long fileMapped) {
        this.fileMapped = fileMapped;
    }

    public Long getFileWriteback() {
        return fileWriteback;
    }

    public void setFileWriteback(Long fileWriteback) {
        this.fileWriteback = fileWriteback;
    }

    public Long getInactiveAnon() {
        return inactiveAnon;
    }

    public void setInactiveAnon(Long inactiveAnon) {
        this.inactiveAnon = inactiveAnon;
    }

    public Long getInactiveFile() {
        return inactiveFile;
    }

    public void setInactiveFile(Long inactiveFile) {
        this.inactiveFile = inactiveFile;
    }

    public Long getKernelStack() {
        return kernelStack;
    }

    public void setKernelStack(Long kernelStack) {
        this.kernelStack = kernelStack;
    }

    public Long getPgactivate() {
        return pgactivate;
    }

    public void setPgactivate(Long pgactivate) {
        this.pgactivate = pgactivate;
    }

    public Long getPgdeactivate() {
        return pgdeactivate;
    }

    public void setPgdeactivate(Long pgdeactivate) {
        this.pgdeactivate = pgdeactivate;
    }

    public Long getPgfault() {
        return pgfault;
    }

    public void setPgfault(Long pgfault) {
        this.pgfault = pgfault;
    }

    public Long getPglazyfree() {
        return pglazyfree;
    }

    public void setPglazyfree(Long pglazyfree) {
        this.pglazyfree = pglazyfree;
    }

    public Long getPglazyfreed() {
        return pglazyfreed;
    }

    public void setPglazyfreed(Long pglazyfreed) {
        this.pglazyfreed = pglazyfreed;
    }

    public Long getPgmajfault() {
        return pgmajfault;
    }

    public void setPgmajfault(Long pgmajfault) {
        this.pgmajfault = pgmajfault;
    }

    public Long getPgrefill() {
        return pgrefill;
    }

    public void setPgrefill(Long pgrefill) {
        this.pgrefill = pgrefill;
    }

    public Long getPgscan() {
        return pgscan;
    }

    public void setPgscan(Long pgscan) {
        this.pgscan = pgscan;
    }

    public Long getPgsteal() {
        return pgsteal;
    }

    public void setPgsteal(Long pgsteal) {
        this.pgsteal = pgsteal;
    }

    public Long getShmem() {
        return shmem;
    }

    public void setShmem(Long shmem) {
        this.shmem = shmem;
    }

    public Long getSlab() {
        return slab;
    }

    public void setSlab(Long slab) {
        this.slab = slab;
    }

    public Long getSlabReclaimable() {
        return slabReclaimable;
    }

    public void setSlabReclaimable(Long slabReclaimable) {
        this.slabReclaimable = slabReclaimable;
    }

    public Long getSlabUnreclaimable() {
        return slabUnreclaimable;
    }

    public void setSlabUnreclaimable(Long slabUnreclaimable) {
        this.slabUnreclaimable = slabUnreclaimable;
    }

    public Long getSock() {
        return sock;
    }

    public void setSock(Long sock) {
        this.sock = sock;
    }

    public Long getThpCollapseAlloc() {
        return thpCollapseAlloc;
    }

    public void setThpCollapseAlloc(Long thpCollapseAlloc) {
        this.thpCollapseAlloc = thpCollapseAlloc;
    }

    public Long getThpFaultAlloc() {
        return thpFaultAlloc;
    }

    public void setThpFaultAlloc(Long thpFaultAlloc) {
        this.thpFaultAlloc = thpFaultAlloc;
    }

    public Long getUnevictable() {
        return unevictable;
    }

    public void setUnevictable(Long unevictable) {
        this.unevictable = unevictable;
    }

    public Long getWorkingsetActivate() {
        return workingsetActivate;
    }

    public void setWorkingsetActivate(Long workingsetActivate) {
        this.workingsetActivate = workingsetActivate;
    }

    public Long getWorkingsetNodereclaim() {
        return workingsetNodereclaim;
    }

    public void setWorkingsetNodereclaim(Long workingsetNodereclaim) {
        this.workingsetNodereclaim = workingsetNodereclaim;
    }

    public Long getWorkingsetRefault() {
        return workingsetRefault;
    }

    public void setWorkingsetRefault(Long workingsetRefault) {
        this.workingsetRefault = workingsetRefault;
    }

}
