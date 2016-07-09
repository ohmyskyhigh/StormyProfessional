package com.example.miaor.stormyprofessional.Data;


import com.example.miaor.stormyprofessional.R;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Forecast {
    private Current mCurrent;
    private Day[] mDay;
    private Hour[] mHour;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Day[] getDay() {
        return mDay;
    }

    public void setDay(Day[] day) {
        mDay = day;
    }

    public Hour[] getHour() {
        return mHour;
    }

    public void setHour(Hour[] hour) {
        mHour = hour;
    }

    public static int setIconID(String icon) {
        switch (icon){
            case "clear-day":
                return R.drawable.sunny;
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
}
