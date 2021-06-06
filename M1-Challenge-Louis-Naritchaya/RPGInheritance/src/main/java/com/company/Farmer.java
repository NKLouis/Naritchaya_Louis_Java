package com.company;

public class Farmer extends Characters {

    String plow;
    String harvest;

    public String getPlow() {
        String plow = "plow";
        return plow;
    }

    public void setPlow(String plow) {
        this.plow = plow;
        System.out.println(plow);
    }

    public String getHarvest() {
        String harvest = "harvest";
        return harvest;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
        System.out.println(harvest);
    }
}
