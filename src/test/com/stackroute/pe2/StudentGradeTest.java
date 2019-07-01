package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade studentGrade;

    @Before
    public void setup() {
        System.out.println("Before");
        studentGrade = new StudentGrade();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        studentGrade = null;
    }

    //add new testcase to give size of array
    @Test
    public void givenMarksShouldReturnAvgMinMax() {
        String result = studentGrade.printGrade( new int[]{86, 65, 98, 77});
        assertEquals("The average is 81.5\n" +"The minimum is 65\n" +"The maximum is 98", result);
    }

    @Test
    public void givenEmptyArrayShouldReturnNoMarksProvided() {
        String result = studentGrade.printGrade(new int[]{});
        assertEquals("No Marks Provided", result);
    }

}

