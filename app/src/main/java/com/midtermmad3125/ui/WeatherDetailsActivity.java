package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.midtermmad3125.Model;
import com.midtermmad3125.R;

public class WeatherDetailsActivity extends AppCompatActivity
{
    Model m = new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waether_details);
    }
}
