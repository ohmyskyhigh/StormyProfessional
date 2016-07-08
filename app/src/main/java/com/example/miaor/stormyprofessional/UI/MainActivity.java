package com.example.miaor.stormyprofessional.UI;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.miaor.stormyprofessional.Data.Current;
import com.example.miaor.stormyprofessional.Data.Location;
import com.example.miaor.stormyprofessional.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
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

    private Current mCurrent;

    @BindView(R.id.iconImage) ImageView mIconImage;
    @BindView(R.id.SummaryText) TextView mSummaryText;
    @BindView(R.id.temperatureValue) TextView mTemperatureValue;
    @BindView(R.id.humidityValue) TextView mHumidityValue;
    @BindView(R.id.PrecipChanceValue) TextView mPrecipChanceValue;
    @BindView(R.id.timeValue) TextView mTimeValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (NetworkIsAvailable()) {
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
                    try{
                        String jsonData = response.body().string();
                        Log.v(TAG, jsonData);
                        if (response.isSuccessful()){
                            mCurrent = getCurrentWeather(jsonData);
                            Log.i(TAG, mCurrent.getIconID()
                                    + "," + mCurrent.getHumidity()
                                    + "," + mCurrent.getTemperature()
                                    + "," + mCurrent.getPrecipProbability()
                                    + "," + mCurrent.getSummary()
                                    + "," + mCurrent.getFormattedTime());
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    updateDisplay();
                                }
                            });
                        }
                        else {
                            ErrorMessage();
                        }
                    }
                    catch (IOException | JSONException e){
                        Log.e(TAG, "Exception caught", e);
                    }
                }
            });
        }
        else {
            Toast.makeText(this, R.string.deadNetwork,
                    Toast.LENGTH_LONG).show();
        }
    }

    private void updateDisplay() {
        mTemperatureValue.setText(mCurrent.getTemperature()+"");
        mHumidityValue.setText(mCurrent.getHumidity()+"%");
        mPrecipChanceValue.setText(mCurrent.getPrecipProbability()+"%");
        mSummaryText.setText(mCurrent.getSummary());
        mTimeValue.setText(mCurrent.getFormattedTime());
        mIconImage.setImageDrawable(getResources().getDrawable(mCurrent.getIconID()));
    }

    private Current getCurrentWeather(String jsonData) throws JSONException{
        JSONObject forecast = new JSONObject(jsonData);
        String timeZone = forecast.getString("timezone");
        Log.i(TAG, timeZone);

        JSONObject currently = forecast.getJSONObject("currently");
        Current current = new Current();

        current.setIcon(currently.getString("icon"));
        current.setTime(currently.getLong("time"));
        current.setSummary(currently.getString("summary"));
        current.setHumidity(currently.getDouble("humidity"));
        current.setTemperature(currently.getDouble("temperature"));
        current.setPrecipProbability(currently.getDouble("precipProbability"));
        current.setTimeZone(timeZone);

        return current;
    }

    private void ErrorMessage() {
        AlertDialogFragment dialog = new AlertDialogFragment();
        dialog.show(getFragmentManager(), "error_dialog");
    }

    private boolean NetworkIsAvailable() {
        ConnectivityManager manager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean isAvailable = false;
        if (networkInfo != null && networkInfo.isConnected()){
            isAvailable = true;
        }
        return  isAvailable;
    }
}
