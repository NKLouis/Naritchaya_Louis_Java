package com.company;

import java.util.Objects;

public class BillingAddress {

    private String billingStreet1;
    private String billingStreet2;
    private String billingCity;
    private String billingState;
    private String billingZip;

    public BillingAddress(String billingStreet1, String billingStreet2, String billingCity, String billingState, String billingZip) {
        this.billingStreet1 = billingStreet1;
        this.billingStreet2 = billingStreet2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
    }

    public BillingAddress() {

    }

    public String getBillingStreet1() {
        return billingStreet1;
    }

    public void setBillingStreet1(String billingStreet1) {
        this.billingStreet1 = billingStreet1;
    }

    public String getBillingStreet2() {
        return billingStreet2;
    }

    public void setBillingStreet2(String billingStreet2) {
        this.billingStreet2 = billingStreet2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    @Override
    public String toString() {
        return "BillingAddress{" +
                "billingStreet1='" + billingStreet1 + '\'' +
                ", billingStreet2='" + billingStreet2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip='" + billingZip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingAddress that = (BillingAddress) o;
        return Objects.equals(billingStreet1, that.billingStreet1) && Objects.equals(billingStreet2, that.billingStreet2) && Objects.equals(billingCity, that.billingCity) && Objects.equals(billingState, that.billingState) && Objects.equals(billingZip, that.billingZip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingStreet1, billingStreet2, billingCity, billingState, billingZip);
    }
}
