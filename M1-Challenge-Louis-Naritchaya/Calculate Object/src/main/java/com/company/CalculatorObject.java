package com.company;

public class CalculatorObject {
    public static void main(String[] args) {
        addition(1,1);
        addition(1,1);
        subtraction(23,52);
        multiplication(34,2);
        division(12,3);
        division(12,7);
        addition(3.4,2.3);
        multiplication(6.7,4.4);
        subtraction(5.5,0.5);
        division(10.8,2.2);

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
