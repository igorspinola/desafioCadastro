package com.igorspinola;

public class Address {
    int house_number;
    String city;
    String street;

    public Address(int house_number, String city, String street) {
        this.house_number = house_number;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\''  +
                ",house_number='" + house_number + '\'' +
                ",city='" + city + '\'' +
                '}';
    }

    public int getHouse_number() {
        return house_number;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
