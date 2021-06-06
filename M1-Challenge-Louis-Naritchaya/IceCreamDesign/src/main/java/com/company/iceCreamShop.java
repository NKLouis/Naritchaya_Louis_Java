package com.company;

import java.util.Scanner;

public class iceCreamShop {

    String flavors;
    int scoops;
    double iceCreamPrice;

    public iceCreamShop(String flavors, int scoops, double iceCreamPrice) {
        this.flavors = flavors;
        this.scoops = scoops;
        this.iceCreamPrice = iceCreamPrice;
    }

    public iceCreamShop() {

    }

    //Ice cream flavors
    public String getFlavors() {
        Scanner scan = new Scanner(System.in);
        String flavors = scan.nextLine();
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    //Number of scoops
    public int getScoops() {
        Scanner scan = new Scanner((System.in));
        int scoops = Integer.parseInt(scan.nextLine());
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    //Price
    public double getIceCreamPrice() {
        Scanner scan = new Scanner((System.in));
        int iceCreamPrice = Integer.parseInt(scan.nextLine());
        double pricePerScoop = 3.49;
        return iceCreamPrice * pricePerScoop ;
    }

    public void setIceCreamPrice(double iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }
}




