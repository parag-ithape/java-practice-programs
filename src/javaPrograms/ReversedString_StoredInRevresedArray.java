package javaPrograms;

import java.util.Arrays;

public class ReversedString_StoredInRevresedArray {

	public static void main(String[] args) 
	{
		// Original array
        String[] array = {"abc", "gef", "xyz"};
        
        // Array to store reversed strings
        String[] reversedArray = new String[array.length];
        
        // Loop through each string in the original array
        for (int i = 0; i < array.length; i++) {
            // Reverse the string and store it in the reversedArray
            reversedArray[i] = new StringBuilder(array[i]).reverse().toString();
        }
        
        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));

	}

}
