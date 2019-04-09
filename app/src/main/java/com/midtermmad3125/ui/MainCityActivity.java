package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.InputStream;
import java.io.InputStreamReader;

public class MainCityActivity extends AppCompatActivity
{

    String cityName, country;
    Long population;
    Double lat, longi;
    TextView cName, cc, latitude, longitude, popul;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cName = (TextView) findViewById(R.id.txtCityName);
        cc = (TextView) findViewById(R.id.txtCC);
        latitude = (TextView) findViewById(R.id.txtLatitude);
        longitude = (TextView) findViewById(R.id.txtLogitude);
        popul = (TextView) findViewById(R.id.txtPopu);
        btnNext = (Button) findViewById(R.id.btnShow);

        loadJson();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainCityActivity.this, WeatherListActivity.class));
            }
        });
    }

    private void loadJson() {
        String jsonString = ReadJSONUtils.loadJSONFromAsset(getApplicationContext(),"moscow_weather");
        if(jsonString != null){
            try{
                //get JSON Object
                JSONObject mObj = new JSONObject(jsonString);
                //Fetching City Details
                JSONObject cityObj = mObj.getJSONObject("city");
                cityName = cityObj.getString("name");
                cName.setText(cityName);
                System.out.println(cityName);
                country = cityObj.getString("country");
                cc.setText(country);
                population = cityObj.getLong("population");
                popul.setText(population.toString());

                //Object to fetch Lang and Long
                JSONObject coord = cityObj.getJSONObject("coord");
                lat = coord.getDouble("lat");
                latitude.setText(lat.toString());
                longi = coord.getDouble("lon");
                longitude.setText(longi.toString());


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }




}
