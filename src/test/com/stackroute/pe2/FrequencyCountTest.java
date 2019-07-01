package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class FrequencyCountTest {
    FrequencyCount frequencyCount;

    @Before
    public void setup() {
        System.out.println("Before");
        frequencyCount = new FrequencyCount();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        frequencyCount = null;
    }


    @Test
    public void givenFileShouldReturnFrequencyCount() {
       String result= frequencyCount.frequency("config/FileDemo.txt");
        assertEquals("Counted", result);

    }
    @Test
    public void givenFileIfNotFoundShouldReturnNotFoundMessage() {
        String result=  frequencyCount.frequency("config/days1.txt");
        assertEquals("No file found in the givenpath", result);
    }

}