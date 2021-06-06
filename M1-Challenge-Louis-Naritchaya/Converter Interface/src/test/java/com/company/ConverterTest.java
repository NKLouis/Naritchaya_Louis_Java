
package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConverterTest {
    private ConverterIf ifElse = new ConverterIf();

    @Test
    public void shouldConvertGivenNumberToCorrespondingMonth() {
        assertEquals("January", ifElse.convertMonth(1));
        assertEquals("March", ifElse.convertMonth(3));
        assertEquals("July", ifElse.convertMonth(7));
        assertEquals("December", ifElse.convertMonth(12));
    }
    @Test
    public void shouldConvertGivenNumberToCorrespondingDay() {
        assertEquals("Wednesday", ifElse.convertDay(3));
        assertEquals("Friday", ifElse.convertDay(5));
        assertEquals("Sunday", ifElse.convertDay(7));
    }

    private ConverterSwitch switchCase = new ConverterSwitch();

    @Test
    public void shouldConvertGivenNumberToCorrespondingMonthSwitchCase() {
        assertEquals("February",switchCase.convertMonth(2));
        assertEquals("April",switchCase.convertMonth(4));
        assertEquals("October",switchCase.convertMonth(10));
        assertEquals("November",switchCase.convertMonth(11));
    }
    @Test
    public void shouldConvertGivenNumberToCorrespondingDaySwitchCase() {
        assertEquals("Monday", ifElse.convertDay(1));
        assertEquals("Thursday", ifElse.convertDay(4));
        assertEquals("Saturday", ifElse.convertDay(6));
    }




}

