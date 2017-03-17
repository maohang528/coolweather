package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/3/17.
 */

public class City extends DataSupport {

    private int id;   //每个实体类都应该有的字段

    private String cityName;

    private int cityCode;   //记录市的代号

    private int provinceId;  //记录当前市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
