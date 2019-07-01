package com.stackroute.pe2;

public class EvenNum {
    public static boolean isEven(int number){
        boolean result=false;
        if(number==0)
            return result;
        else if(number%2==0)
        {
            result=true;
            return result;
        }

        else {
            result = false;
            return result;
        }
    }
}

