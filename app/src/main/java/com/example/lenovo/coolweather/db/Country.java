package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/3/17.
 */

public class Country extends DataSupport {

    private  int id;

    private String countryName;

    private String weatherId;  //记录县所对应的天气ID

    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
