package com.huyong.entity;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/14.
 */
public class IpInfoBean {
    public String country;
    public String country_id;
    public String area;
    public String area_id;
    public String region;
    public String region_id;
    public String city;
    public String city_id;
    public String county;
    public String county_id;
    public String isp;
    public String isp_id;
    public String ip;

    public IpInfoBean() {
    }

    public IpInfoBean(String country, String country_id, String area, String area_id, String region,
                      String region_id, String city, String city_id, String county, String county_id,
                      String isp, String isp_id, String ip) {
        this.country = country;
        this.country_id = country_id;
        this.area = area;
        this.area_id = area_id;
        this.region = region;
        this.region_id = region_id;
        this.city = city;
        this.city_id = city_id;
        this.county = county;
        this.county_id = county_id;
        this.isp = isp;
        this.isp_id = isp_id;
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty_id() {
        return county_id;
    }

    public void setCounty_id(String county_id) {
        this.county_id = county_id;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getIsp_id() {
        return isp_id;
    }

    public void setIsp_id(String isp_id) {
        this.isp_id = isp_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "IpInfoBean-->[country=" + country + ", country_id=" + country_id
                + ", area=" + area + ", area_id=" + area_id + ", region="
                + region + ", region_id=" + region_id + ", city=" + city
                + ", city_id=" + city_id + ", county=" + county
                + ", county_id=" + county_id + ", isp=" + isp + ", isp_id="
                + isp_id + ", ip=" + ip + "]";
    }
}
