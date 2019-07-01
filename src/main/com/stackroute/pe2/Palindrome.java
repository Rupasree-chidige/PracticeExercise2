package com.stackroute.pe2;

public class Palindrome {

    public  String isPalindrome(String input) {
        String returnResult = null;

        try {
            StringBuilder result = new StringBuilder();
            char inputArray[] = input.toCharArray();
            int j = 0;
            for (int i = (input.length() - 1); i >= 0; i--) {
                result = result.append(inputArray[i]);
                j++;
            }
            if (result.toString().equals(input)) {
                returnResult = input.concat(" is a palindrome");
            } else {
                returnResult = input.concat(" is not a palindrome");
            }
            return returnResult;
        }
        catch (NullPointerException e){
            returnResult="Given Null";
            return returnResult;
        }


    }


    public  String isPalindrome(int number)
    {
        String result=null;
        if(number!=0) {
            int resultEven = 0;
            int temp = number, sum = 0, rem;
            while (number != 0) {
                rem = number % 10;
                sum = sum * 10 + rem;
                number = number / 10;
            }
            if (sum == temp) {
                result = temp + " is a palindrome";
            } else {
                result = temp + " is not palindrome";
            }
            return result;
        }
        else{
            result="Given Zero As Input";
            return result;
        }

    }



}
