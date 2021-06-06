package com.company;

public class main {
    public static void main(String[] args) {

        ConverterIf day = new ConverterIf();
        String dayResult = day.convertDay(2);
        System.out.println("It is " + dayResult);

        ConverterIf month = new ConverterIf();
        String monthResult = month.convertMonth(1);
        System.out.println("It is "+ monthResult);

        ConverterSwitch dayString = new ConverterSwitch();
        String dayStringResult = dayString.convertDay(3);
        System.out.println("It is "+ dayStringResult);

        ConverterIf monthString = new ConverterIf();
        String monthStringResult = monthString.convertMonth(10);
        System.out.println("It is "+ monthStringResult);


    }
}
