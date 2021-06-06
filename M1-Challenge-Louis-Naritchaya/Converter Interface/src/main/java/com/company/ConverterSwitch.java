package com.company;

public class ConverterSwitch implements Converter {

    public String convertMonth(int monthString) {
        String monthOfYear ;
        switch (monthString) {
            case 1:
                monthOfYear = "January";
                break;
            case 2:
                monthOfYear = "February";
                break;
            case 3:
                monthOfYear = "March";
                break;
            case 4:
                monthOfYear = "April";
                break;
            case 5:
                monthOfYear = "May";
                break;
            case 6:
                monthOfYear = "June";
                break;
            case 7:
                monthOfYear = "July";
                break;
            case 8:
                monthOfYear = "August";
                break;
            case 9:
                monthOfYear = "September";
                break;
            case 10:
                monthOfYear = "October";
                break;
            case 11:
                monthOfYear = "November";
                break;
            case 12:
                monthOfYear = "December";
                break;
            default:
                monthOfYear = "Invalid month";
                break;
        }
        return monthOfYear;
    }

        public String convertDay(int dayString) {
            String dayOfWeek ;
            switch (dayString) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Invalid month";
                    break;
            }
            return dayOfWeek;
        }

}















