package com.stackroute.pe2;

public class Factorial {

    /*
    * find factorial of the number if it is greater than MAX_VALUE of
    * Integer then it returns Out of bound */
    public String findFact(int input)
    {
        String result=null;
        if(!(input <0)) {
            if (input == 0) {
                result = "Factorial of 0 is 1";
                return result;
            }
            long fact = 1;
            System.out.println(Integer.MAX_VALUE);
            for (int i = 1; i <= input; i++) {
                fact = fact * i;
                if (fact >= 1 && fact <= Integer.MAX_VALUE) {

                    result = "factorial success";
                } else {

                    result = "Out of bound";
                    break;
                }
            }

            return result;
        }
        else{
            result="Given Negative Number";
            return result;
        }
    }
    /*
     * find factorial of the number if it is greater than MAX_VALUE of
     * Long  then it returns Out of bound */
    public String findLongFact(long input)
    {
        String result=null;
        if(!(input <0)) {
            if (input == 0) {
                result = "Factorial of 0 is 1";
                return result;
            }
            long fact = 1;

            for (int i = 1; i <= input; i++) {
                fact = fact * i;
                if (fact >= 1 && fact <= Long.MAX_VALUE) {

                    result = "factorail Success";
                } else {

                    result = "Out of bound";
                    break;
                }
            }

            return result;
        }
        else{
            result="Given Negative Number";
            return result;
        }
    }
}
