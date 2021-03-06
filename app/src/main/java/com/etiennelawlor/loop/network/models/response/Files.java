package com.etiennelawlor.loop.network.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by etiennelawlor on 5/23/15.
 */
public class Files {

    // region Fields
    @SerializedName("h264")
    private H264 h264;
    @SerializedName("hls")
    private HLS hls;
    @SerializedName("vp6")
    private VP6 vp6;
    @SerializedName("progressive")
    private List<ProgressiveData> progressive;
    // endregion

    // region Getters
    public H264 getH264() {
        return h264;
    }

    public HLS getHls() {
        return hls;
    }

    public VP6 getVp6() {
        return vp6;
    }

    public List<ProgressiveData> getProgressive() {
        return progressive;
    }
    // endregion

    // region Setters
    public void setH264(H264 h264) {
        this.h264 = h264;
    }

    public void setHls(HLS hls) {
        this.hls = hls;
    }

    public void setVp6(VP6 vp6) {
        this.vp6 = vp6;
    }

    public void setProgressive(List<ProgressiveData> progressive) {
        this.progressive = progressive;
    }
    // endregion
}
