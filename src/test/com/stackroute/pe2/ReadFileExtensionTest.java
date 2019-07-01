package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class ReadFileExtensionTest {


        ReadFileExtension readFileExtension;

        @Before
        public void setup() {
            System.out.println("Before");
            readFileExtension = new ReadFileExtension();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            readFileExtension = null;
        }



        @Test
        public void givenFileShouldReturnReadedUsingByteArray() {
            String result= readFileExtension.readFile("/home/rupa/Documents");
            assertEquals("Read Using Byte Array", result);

        }
        @Test
        public void givenFileIfNotFoundShouldReturnNotFoundMessage() {
            String result=  readFileExtension.readFile("/home/rupa/Documents1");
            assertEquals("Directory Not Found", result);
        }


    }