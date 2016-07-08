package com.example.miaor.stormyprofessional.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.miaor.stormyprofessional.Data.Location;
import com.example.miaor.stormyprofessional.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    Location mLocation = new Location();
    private String apiKey = "6b9448b8e21c2abe2fb623b25554a77c";
    private String forecastURL = "https://api.forecast.io/forecast/" + apiKey +
            "/" + mLocation.getZhangjiagang();
    ///https://api.forecast.io/forecast/6b9448b8e21c2abe2fb623b25554a77c/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(forecastURL)
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "failure");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Log.v(TAG, "json");
            }
        });
    }
}
