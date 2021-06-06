package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorObjectTest {
    private CalculatorObject calc = new CalculatorObject();

    @Test
    public void shouldReturnSummationOfTwoInteger() {
        assertEquals(2.0, calc.addition(1, 1),4);
        assertEquals( 5.6999, calc.addition(3.4, 2.3),4);
    }

    @Test
    public void shouldReturnDifferenceOfTwoInteger() {
        assertEquals(-29.0 , calc.subtraction(23, 52),4);
        assertEquals( 5.0, calc.subtraction(5.5, 0.5),4);
    }

    @Test
    public void shouldReturnProductOfTwoIntegerWhenGivenTwoInteger() {
        assertEquals(  68.0, calc.multiplication(34, 2),4);
        assertEquals( 29.480000000000004, calc.multiplication(6.7, 4.4),4);
    }

    @Test
    public void shouldReturnQuotientOfTwoIntegerWhenGivenTwoInteger() {
        assertEquals(4.0, calc.division(12, 3),4);
        assertEquals(1.7142857142857142, calc.division(12, 7),4);
        assertEquals(4.909090909090909 , calc.division(10.8, 2.2),4);
    }
}