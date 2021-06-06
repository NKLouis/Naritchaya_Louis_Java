package com.company;

public class ConverterIf implements Converter {

    public String convertMonth(int monthOfYear) {

        int i = monthOfYear;
        if (i == 1) {
            return "January";
        } else if (i == 2) {
            return "February";
        } else if (i == 3) {
            return "March";
        } else if (i == 4) {
            return "April";
        } else if (i == 5) {
            return "May";
        } else if (i == 6) {
            return "June";
        } else if (i == 7) {
            return "July";
        } else if (i == 8) {
            return "August";
        } else if (i == 9) {
            return "September";
        } else if (i == 10) {
            return "October";
        } else if (i == 11) {
            return "November";
        } else {
            return "December";
        }
    }

    public String convertDay(int dayOfWeek) {
        int i = dayOfWeek;
        if (i == 1) {
            return "Monday";
        } else if (i == 2) {
            return "Tuesday";
        } else if (i == 3) {
            return "Wednesday";
        } else if (i == 4) {
            return "Thursday";
        } else if (i == 5) {
            return "Friday";
        } else if (i == 6) {
            return "Saturday";
        } else {
            return "Sunday";
        }
    }

}
