package com.stackroute.pe2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UpperCaseFile {
    public String  printUpperCase(String fname)
    {
        String result=null;
        try {
            if (fname != null) {

                File f = new File(fname);     //Creation of File Descriptor for input file
                FileReader fr = new FileReader(f);   //Creation of File Reader object
                BufferedReader br = new BufferedReader(fr);  //Creation of BufferedReader object
                int c = 0;
                int count=0;
                while ((c = br.read()) != -1)         //Read char by Char
                {
                    char character = (char) c;
                    //converting integer to char
                    System.out.print(Character.toUpperCase(character));
                    count++;//Display the Character
                }
                System.out.println("length of file is "+count);
                result="Converted to UpperCase";
            }
            else{
                result="Pass a file Path";
            }
        }
       catch(FileNotFoundException e){
               result="File not found in the specified path";
            } catch(IOException e){
               result="Exception While Reading File";
            }
        return result;
        }


    }

