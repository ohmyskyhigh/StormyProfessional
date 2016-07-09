package com.example.miaor.stormyprofessional.Data;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Day {
    private long mTime;
    private Double mTemperatureMax;
    private String mIcon;
    private String mSummary;
    private String mTimeZone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public Double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(Double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}
