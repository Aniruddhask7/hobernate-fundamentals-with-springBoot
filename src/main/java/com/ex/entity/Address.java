package com.ex.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String house_no;
    private String Street;
    private String State;


    public Address(){}
    public Address(String city, String house_no, String street, String state) {
        this.city = city;
        this.house_no = house_no;
        Street = street;
        State = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
