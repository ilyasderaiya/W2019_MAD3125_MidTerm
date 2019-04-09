package com.midtermmad3125.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.midtermmad3125.R;

public class WeatherDetailsActivity extends AppCompatActivity
{

    TextView dt, min, max, wdet, wdes;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waether_details);
        dt = (TextView) findViewById(R.id.txtDt);
        min = (TextView) findViewById(R.id.txtMin);
        max = (TextView) findViewById(R.id.txtMax);
        wdet = (TextView) findViewById(R.id.txtWDet);
        wdes =(TextView) findViewById(R.id.txtWDes);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String date = extras.getString("date");
            String mint = extras.getString("min");
            String maxt = extras.getString("max");
            String wdeta = extras.getString("wdetail");
            String wdesc = extras.getString("wdesc");
            String s = "Min:" + mint + "°C";
            String s1 = "Max:" + maxt + "°C";

            dt.setText(date);
            min.setText(s);
            max.setText(s1);
            wdet.setText(wdeta);
            wdes.setText(wdesc);

        }


    }
}
