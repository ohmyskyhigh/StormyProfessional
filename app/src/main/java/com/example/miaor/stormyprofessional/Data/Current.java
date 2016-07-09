package com.example.miaor.stormyprofessional.Data;

import com.example.miaor.stormyprofessional.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Current {
    private String mIcon;
    private String mSummary;
    private String mTimeZone;
    private Long mTime;
    private Double mTemperature;
    private Double mHumidity;
    private Double mPrecipProbability;


    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    //clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
    public int setIconID(String icon) {
        return Forecast.setIconID(icon);
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

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);

        return formatter.format(dateTime);
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int)Math.round((mTemperature - 32)/1.8);
    }

    public void setTemperature(Double temperature) {
        mTemperature = temperature;
    }

    public int getHumidity() {
        return (int) Math.round(mHumidity * 100);
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
