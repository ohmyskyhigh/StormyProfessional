package com.example.miaor.stormyprofessional.Data;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Hour implements Parcelable{
    private Long mTime;
    private Double mTemperature;
    private String mTimeZone;
    private String mSummary;
    private String mIcon;

    public Long getTime() {
        return mTime;
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

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    public int getIconID(){
        return Forecast.setIconID(mIcon);
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSummary);
        parcel.writeString(mIcon);
        parcel.writeString(mTimeZone);
        parcel.writeDouble(mTemperature);
        parcel.writeLong(mTime);
    }

    private Hour(Parcel in){
        mSummary = in.readString();
        mIcon = in.readString();
        mTimeZone = in.readString();
        mTemperature = in.readDouble();
        mTime = in.readLong();
    }

    public Hour(){}

    public static final Creator<Hour>CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel parcel) {
            return new Hour(parcel);
        }


        @Override
        public Hour[] newArray(int i) {
            return new Hour[i];
        }
    };
}
