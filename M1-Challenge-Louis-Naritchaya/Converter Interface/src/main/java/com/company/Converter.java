package com.company;

public interface Converter {
    /**
     * This method converts the given number into its corresponding month.
     * @param monthOfYear the number you wish to convert to a month
     */
    String convertMonth(int monthOfYear);
    /**
     * This method converts the given number into its corresponding day of the week.
     * @param dayOfWeek number you wish to convert to a day of the week
     * @return the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     *      * The first day of the week is Sunday
     */
    String convertDay(int dayOfWeek);
}
