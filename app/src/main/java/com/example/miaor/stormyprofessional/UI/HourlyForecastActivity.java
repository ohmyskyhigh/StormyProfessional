package com.example.miaor.stormyprofessional.UI;


import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.miaor.stormyprofessional.Data.Hour;
import com.example.miaor.stormyprofessional.R;

import java.util.Arrays;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.Hourly_Forecast);
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }
}
