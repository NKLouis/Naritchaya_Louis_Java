package com.company;

public class Constable extends Characters {
    String jurisdiction;
    String arrest;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
        System.out.println(jurisdiction);
    }

    public String getArrest() {
        String arrest = "arrest";
        return arrest;
    }

    public void setArrest(String arrest) {
        this.arrest = arrest;
        System.out.println(arrest);
    }
}









