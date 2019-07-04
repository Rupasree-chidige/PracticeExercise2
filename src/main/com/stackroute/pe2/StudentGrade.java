package com.stackroute.pe2;

public class StudentGrade {
    //calculate the average of marks
    public float Average(int marks[])
    {
        float average = (float) 0.0;
        try {
            for (int i = 0; i < marks.length; i++) {
                average = average + marks[i];

            }
            average = average / marks.length;
            return average;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            return -1;
        }
    }

//calculate the maximum of the marks
    public  int getMax(int[] inputArray){
        try {
            int maxValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] > maxValue) {
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            return -1;
        }
    }
    //calculate the minimum of the marks
    public  int getMin(int[] inputArray){
        try {
            int minValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < minValue) {
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            return -1;
        }
    }

    public String printGrade(int marks[])
    {
        if(marks.length!=0)
        {
        StringBuffer stringBuffer=new StringBuffer();
        StudentGrade studentGrade=new StudentGrade();

        stringBuffer=stringBuffer.append("The average is "+studentGrade.Average(marks)+"\n" +
                "The minimum is "+studentGrade.getMin(marks)+"\n" + "The maximum is "+studentGrade.getMax(marks));
        System.out.println(stringBuffer);
        return stringBuffer.toString();

    }
        else{
        return "No Marks Provided";
        }
    }
}
