package com.stackroute.pe2;

public class PowerOfFour {
    //checks weather the given integer is a power of four
    //if the input is negative number then it returns Given Negative Number Message
    public String isPowerOfFour(int n)
    {
        String result=null;
        if(n == 0) {
            result = "Error! Input is zero";
            return result;
        }
        if(n<0){
            result="Given Negative Number";
        }
        else {


            while (n != 1) {
                if (n % 4 != 0) {
                    result = "Not a Power of 4";
                    return result;
                }

                n = n / 4;

            }
            result="Power of 4";
        }

        return result;
    }
}
