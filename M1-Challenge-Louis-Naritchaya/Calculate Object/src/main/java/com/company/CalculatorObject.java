package com.company;

public class CalculatorObject {
    public static void main(String[] args) {
        System.out.println("1 + 1 = " +addition(1,1));
        System.out.println("23 - 52 = " +subtraction(23,52));
        System.out.println("34 x 2 = " +multiplication(34,2));
        System.out.println("12 / 3 = " +division(12,3));
        System.out.println("12 / 7 = " +division(12,7));
        System.out.println("3.4 + 2.3 = " +addition(3.4,2.3));
        System.out.println("6.7 x 4.4 = " +multiplication(6.7,4.4));
        System.out.println("5.5 - 0.5 = " +subtraction(5.5,0.5));
        System.out.println("10.8 / 2.2 = " +division(10.8,2.2));

    }

    public static double addition(double a, double b){

        double add = a + b;
        System.out.println(add);
        return add;
    }
    public static double subtraction(double a, double b){

        double sub =  a - b;
        System.out.println(sub);
        return sub;
    }

    public static double multiplication(double a, double b){

        double mul = a * b;
        System.out.println(mul);
        return mul;
    }
    public static double division(double a, double b){

        double div = a / b;
        System.out.println(div);
        return div;
    }
}
