package com.stackroute.pe2;

public class EvenNum {

    /*
    * checks the number whether it is even number or not.
    * if it is even then it returns true else false*/
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

