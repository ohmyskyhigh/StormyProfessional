package com.example.miaor.stormyprofessional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.miaor.stormyprofessional.Data.Location;
import com.example.miaor.stormyprofessional.R;


public class MainActivity extends AppCompatActivity {
    Location mLocation = new Location();
    private String apiKey = "6b9448b8e21c2abe2fb623b25554a77c";
    private String forecastURL = "https://api.forecast.io/forecast/" + apiKey +
            "/" + mLocation.getZhangjiagang();
    ///https://api.forecast.io/forecast/6b9448b8e21c2abe2fb623b25554a77c/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
