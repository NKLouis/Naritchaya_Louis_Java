package com.company;

import java.util.Objects;

public class ShippingAddress{
    private String shippingStreet1;
    private String shippingStreet2;
    private String shippingCity;
    private String shippingState;
    private String shippingZip;

    public ShippingAddress(String shippingStreet1, String shippingStreet2, String shippingCity, String shippingState, String shippingZip) {
        this.shippingStreet1 = shippingStreet1;
        this.shippingStreet2 = shippingStreet2;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;
    }

    public ShippingAddress() {

    }

    public String getShippingStreet1() {
        return shippingStreet1;
    }

    public void setShippingStreet1(String shippingStreet1) {
        this.shippingStreet1 = shippingStreet1;
    }

    public String getShippingStreet2() {
        return shippingStreet2;
    }

    public void setShippingStreet2(String shippingStreet2) {
        this.shippingStreet2 = shippingStreet2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "shippingStreet1='" + shippingStreet1 + '\'' +
                ", shippingStreet2='" + shippingStreet2 + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZip='" + shippingZip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAddress that = (ShippingAddress) o;
        return Objects.equals(shippingStreet1, that.shippingStreet1) && Objects.equals(shippingStreet2, that.shippingStreet2) && Objects.equals(shippingCity, that.shippingCity) && Objects.equals(shippingState, that.shippingState) && Objects.equals(shippingZip, that.shippingZip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shippingStreet1, shippingStreet2, shippingCity, shippingState, shippingZip);
    }
}
