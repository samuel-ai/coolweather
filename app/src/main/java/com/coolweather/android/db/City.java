package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Samuel on 2017/8/18.
 */

public class City extends DataSupport {

    private int id;

    private String CityName;

    private int CityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

}
