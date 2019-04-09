package com.midtermmad3125;

import java.io.Serializable;

public class Details implements Serializable {

    public String cityName;
    public String date;
    public Double day, night,morn, eve, min, max, pressure;
    public Integer humidity;
    public String wMain, wDesc;
    public Double speed, rain;
    public Integer clouds;

    public  Details(String cName, String date, Double day, Double night, Double morn, Double eve, Double min, Double max, Double pressure, Integer humidity, String wMain, String wDesc, Double speed, Double rain, Integer clouds) {
        this.cityName = cName;
        this.date = date;
        this.day = day;
        this.night = night;
        this.morn = morn;
        this.eve = eve;
        this.min = min;
        this.max = max;
        this.pressure = pressure;
        this.humidity =humidity;
        this.wMain = wMain;
        this.wDesc = wDesc;
        this.speed = speed;
        this.rain = rain;
        this.clouds = clouds;
    }

}
