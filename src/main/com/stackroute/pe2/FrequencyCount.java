package com.stackroute.pe2;

import java.io.*;
import java.util.*;

public class FrequencyCount {
    /*
    * Takes the String as input and count the frequency of each word in a string*/
    public String frequency(String fname)
    {
         Map<String, Integer> wordCounts;
        try (Scanner input = new Scanner(new File((fname)))) {

            wordCounts = new TreeMap<String, Integer>();
            while (input.hasNext()) {
                String next = input.next().toLowerCase();
                if (!wordCounts.containsKey(next)) {
                    wordCounts.put(next, 1);
                } else {
                    wordCounts.put(next, wordCounts.get(next) + 1);
                }
            }

            wordCounts.entrySet().forEach(entry->{
                System.out.println(entry.getKey() + "-- " + entry.getValue());
            });
        } catch (FileNotFoundException e) {
         return "No file found in the givenpath";
        }


    return "Counted";
    }
}