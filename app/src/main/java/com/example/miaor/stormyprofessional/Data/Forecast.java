package com.example.miaor.stormyprofessional.Data;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class Forecast {
    private Current mCurrent;
    private Day mDay;
    private Hour mHour;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Day getDay() {
        return mDay;
    }

    public void setDay(Day day) {
        mDay = day;
    }

    public Hour getHour() {
        return mHour;
    }

    public void setHour(Hour hour) {
        mHour = hour;
    }
}
