package com.company;

import java.util.Scanner;

public class iceCreamFactory{
    double milk;
    double sugar;
    double fruit;


    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setFruit(double fruit) {
        this.fruit = fruit;
    }

    public double getMilk() {
        Scanner scan = new Scanner((System.in));
        double numberGalOfMilk = Integer.parseInt(scan.nextLine());
        double milkPricePerGal = 2.59;
        double milkCosts = numberGalOfMilk * milkPricePerGal;
        return milkCosts;
    }

    public double getSugar() {
        Scanner scan = new Scanner((System.in));
        double numberLbsOfSugar = Integer.parseInt(scan.nextLine());
        double sugarPricePerLb = 6.13;
        double sugarCosts = numberLbsOfSugar * sugarPricePerLb;
        return sugarCosts;
    }

    public double getFruit() {
        Scanner scan = new Scanner((System.in));
        double numberLbOfFruit = Integer.parseInt(scan.nextLine());
        double fruitPricePerLb = 3.62;
        double fruitCosts = numberLbOfFruit * fruitPricePerLb;
        return fruitCosts;
    }
}
