package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {


    PowerOfFour powerOfFour;

    @Before
    public void setup() {
        System.out.println("Before");
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        powerOfFour = null;
    }



    @Test
    public void givenPowerOf4IntegerShouldReturnPowerOf4() {
        String result =powerOfFour.isPowerOfFour(64);
        assertEquals("Power of 4",result);
    }
    @Test
    public void givenNotPowerOf4IntegerShouldReturnNotPowerOf4() {
        String result =powerOfFour.isPowerOfFour(24);
        assertEquals("Not a Power of 4", result);
    }
    @Test
    public void givenZeroShouldReturnErroeMessage() {
        String result =powerOfFour.isPowerOfFour(0);
        assertEquals("Error! Input is zero", result);
    }
    @Test
    public void givenNegativeIntegerShouldReturnGivenNegativeNumber() {
        String result =powerOfFour.isPowerOfFour(-64);
        assertEquals("Given Negative Number", result);
    }
}