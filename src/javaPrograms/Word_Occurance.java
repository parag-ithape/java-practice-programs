package javaPrograms;

import java.util.*;
import java.util.Map.Entry;

public class Word_Occurance {
	public static void main(String[] args) {
        String input = "This is a test. This test is a simple test.";

       String lower=input.replaceAll("[^a-zA-Z]", "").toLowerCase();
       
       String[]words=lower.split("+\\s");
       Map<String, Integer> wordCounts=new HashMap<>();
       
       for(String word:words)
       {
    	   wordCounts.put(word, wordCounts.getOrDefault(word, 0)+1);
       }
       

       
       
}

}
