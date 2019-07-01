package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class FactorialTest {


        Factorial factorial;
        @Before
        public void setup() {
            System.out.println("Before");
            factorial = new Factorial();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            factorial = null;
        }



        @Test
        public void givenIntShouldReturnFactorial() {
            String result = factorial.findFact(10);
            assertEquals("factorial success", result);
        }
        @Test
        public void giveninputShouldReturnLongFactorial() {
            String result = factorial.findLongFact(30);
            assertEquals("Out of bound", result);
        }
        @Test
        public void giveninputZeroShouldReturnOne() {
            String result = factorial.findLongFact(0);
            assertEquals("Factorial of 0 is 1", result);
        }
    @Test
    public void givenNegativeIntegerShouldReturnGivenNegativeNumber() {
        String result = factorial.findLongFact(-5);
        assertEquals("Given Negative Number", result);
    }


    }