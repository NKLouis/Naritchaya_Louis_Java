package com.company;
import java.util.Scanner;

public class App {
    public String scoop;

    public static void main(String[] args) {

    //****************At ice cream shop **************
        // Asking for a flavor
        System.out.println("********At an ice cream shop***********");
        System.out.println("what flavor of ice cream?");
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.nextLine();

    // Asking for the number of scoops
        iceCreamShop scoops = new iceCreamShop();
        System.out.println("How many scoops of " + flavor +" ice cream?");
        scoops.getScoops();
        System.out.println( "Please confirm the number of scoops");


    //Calculated a total price
        iceCreamShop price = new iceCreamShop();
        double totalPrice = price.getIceCreamPrice();
        System.out.println("Your Total Price is $" + totalPrice + "  ---> THANK YOU <---");

        System.out.println("");
        System.out.println("");

    //**************** Ice cream recipe at a factory **************
        System.out.println("*****Ice cream recipe at a factory*****");
        System.out.println("How many gallons of milk?");
        iceCreamFactory milk = new iceCreamFactory();
        double milkCost = milk.getMilk();

        System.out.println("How many lbs of sugar?");
        iceCreamFactory sugar = new iceCreamFactory();
        double sugarCost = sugar.getSugar();

        System.out.println("How many lbs of fruit?");
        iceCreamFactory fruit = new iceCreamFactory();
        double fruitCost = fruit.getFruit();

        double totalFactoryIngredientCost = milkCost + sugarCost + fruitCost;

        System.out.println("Milk cost $" + milkCost);
        System.out.println("Sugar cost $" + sugarCost);
        System.out.println("Milk cost $" + fruitCost);
        System.out.println("Total Cost--->" + totalFactoryIngredientCost);

    }
}




