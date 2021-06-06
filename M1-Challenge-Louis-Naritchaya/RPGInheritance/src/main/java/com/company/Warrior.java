package com.company;

public class Warrior extends Characters {

    String shieldStrength;
    String decreaseShieldStrength;


    public String getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(String shieldStrength) {
        this.shieldStrength = shieldStrength;
        System.out.println(shieldStrength);
    }

    public String getDecreaseShieldStrength() {
        String decreaseShieldStrength = "decreaseShieldStrength";
        return decreaseShieldStrength;
    }

    public void setDecreaseShieldStrength(String decreaseShieldStrength) {
        this.decreaseShieldStrength = decreaseShieldStrength;
        System.out.println(decreaseShieldStrength);
    }

}
