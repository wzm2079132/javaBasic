package com.neuedu.com.neuedu.HomeWork0611;

public class Site {

    private String name;
    private String street;//街道
    private String city;//市
    private String province;//省
    private String area;//国家

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Site(){

    }

    public Site(String name, String street, String city, String province, String area) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.province = province;
        this.area = area;
    }

    @Override
    public String toString() {
        return  "名字：" + name + ", 街道：" + street + ", 城市：" + city + ", 省份：" + province +
                ", 地区：" + area ;
    }
}
