package com.example.miaor.stormyprofessional.Data;


import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Day implements Parcelable{
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

    public int getTemperatureMax() {
        return (int)Math.round((mTemperatureMax - 32)/1.8);
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


    public String getDayOfTheWeek() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);

        return formatter.format(dateTime);
    }


    public int getIconID() {
        return Forecast.setIconID(mIcon);
    }


    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeDouble(mTemperatureMax);
        dest.writeString(mIcon);
        dest.writeString(mTimeZone);
        dest.writeString(mSummary);
    }

    private Day(Parcel in){
        mTime = in.readLong();
        mTemperatureMax = in.readDouble();
        mIcon = in.readString();
        mTimeZone = in.readString();
        mSummary = in.readString();
    }

    public Day() {}

    public static final Creator<Day>CREATOR = new Creator<Day>() {
        @Override
        public Day createFromParcel(Parcel source) {
            return new Day(source);
        }


        @Override
        public Day[] newArray(int size) {
            return new Day[size];
        }
    };
}
