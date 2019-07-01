package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class UpperCaseFileTest {
    UpperCaseFile upperCaseFile;

    @Before
    public void setup() {
        System.out.println("Before");
        upperCaseFile = new UpperCaseFile();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        upperCaseFile = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {

        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenFileShouldReturnCovnertedUpperCase() {
       String result= upperCaseFile.printUpperCase("config/days.txt");
        assertEquals("Converted to UpperCase", result);

    }
    @Test
    public void givenNotCorrectFilePathShouldReturnNotFound() {
      String result=  upperCaseFile.printUpperCase("config/days1.txt");
       assertEquals("File not found in the specified path", result);
    }
    @Test
    public void givenNullShouldReturnPassAPathMessage() {
       String result= upperCaseFile.printUpperCase(null);
        assertEquals("Pass a file Path", result);
    }


}