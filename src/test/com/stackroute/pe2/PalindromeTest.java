package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setup() {
        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        palindrome = null;
    }

    @Test
    public void givenStringShouldReturnIsPalindrome() {
        String result =palindrome.isPalindrome("dad");
        assertEquals("dad is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnIsNotPalindrome() {
        String result =palindrome.isPalindrome("Test");
        assertEquals("Test is not a palindrome",result);
    }
    @Test
    public void givenIntegerShouldReturnIsNotAPalindrome() {
        String result =palindrome.isPalindrome(89675);
        assertEquals("89675 is not palindrome", result);
    }
    @Test
    public void givenIntegerShouldReturnIsAPalindrome() {
        String result =palindrome.isPalindrome(89698);
        assertEquals("89698 is a palindrome", result);
    }
    @Test
    public void givenNullShouldReturnGivenNull() {
        String result =palindrome.isPalindrome(null);
        assertEquals("Given Null",result);
    }
    @Test
    public void givenZeroShouldReturnIsNotPalindrome() {
        String result =palindrome.isPalindrome(0);
        assertEquals("Given Zero As Input",result);
    }



}