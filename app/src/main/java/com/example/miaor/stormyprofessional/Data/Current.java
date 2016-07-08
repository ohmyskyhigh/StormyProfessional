package com.example.miaor.stormyprofessional.Data;

import com.example.miaor.stormyprofessional.R;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Current {
    private String mIcon;
    private String mSummary;
    private Long mTime;
    private Double mTemperature;
    private Double mHumidity;
    private Double mPrecipProbability;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    //clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
    public int setIconID(String icon) {
        switch (icon){
            case "clear-day":
                return R.drawable.clear_day;
            case "clear-night":
                return R.drawable.clear_night;
            case "rain":
                return R.drawable.rain;
            case "snow":
                return R.drawable.snow;
            case "sleet":
                return R.drawable.sleet;
            case "wind":
                return R.drawable.wind;
            case "fog":
                return R.drawable.fog;
            case "cloudy":
                return R.drawable.cloudy;
            case "partly-cloudy-day":
                return R.drawable.partly_cloudy;
            case "partly-cloudy-nigh":
                return R.drawable.cloudy_night;
            default:
                return R.drawable.sunny;
        }
    }

    public int getIconID() {
        return setIconID(mIcon);
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public Double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(Double temperature) {
        mTemperature = temperature;
    }

    public Double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(Double humidity) {
        mHumidity = humidity;
    }

    public Double getPrecipProbability() {
        return mPrecipProbability;
    }

    public void setPrecipProbability(Double precipProbability) {
        mPrecipProbability = precipProbability;
    }
}
