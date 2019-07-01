package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTest {

    @Test
    public void givenEvenIntegerShouldReturnTrue() {
        boolean result =EvenNum.isEven(24);
        assertEquals(true,result);
    }
    @Test
    public void givenOddIntegerShouldReturnFalse() {
        boolean result =EvenNum.isEven(25);
        assertEquals(false, result);
    }
    @Test
    public void givenZeroShouldReturnFalse() {
        boolean result =EvenNum.isEven(0);
        assertEquals(false, result);
    }
    @Test
    public void givenNegativeEvenIntegerShouldReturnTrue() {
        boolean result =EvenNum.isEven(-24);
        assertEquals(true, result);
    }
    @Test
    public void givenNegativeOddIntegerShouldReturnFalse() {
        boolean result =EvenNum.isEven(-21);
        assertEquals(false, result);
    }


}