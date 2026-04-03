package javaPrograms;

public class Longest_Palindrome_In_String {
	
	    // Function to find the longest palindrome in a given string
	    public static String findLongestPalindrome(String str) {
	        if (str == null || str.length() == 0)
	            return "";

	        int start = 0, end = 0;
	        for (int i = 0; i < str.length(); i++) {
	            int len1 = expandFromCenter(str, i, i); // for odd length palindrome
	            int len2 = expandFromCenter(str, i, i + 1); // for even length palindrome
	            int len = Math.max(len1, len2);
	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }
	        return str.substring(start, end + 1);
	    }

	    // Helper function to expand around the center and find palindrome
	    private static int expandFromCenter(String str, int left, int right) {
	        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }

	    // Main method to test the above functions
	    public static void main(String[] args) {
	        String str = "babad";
	        String longestPalindrome = findLongestPalindrome(str);
	        System.out.println("Longest Palindrome: " + longestPalindrome);
	    }
	    
	}

/*Find the longest palindrome in a given string.
Remove all the duplicate characters present in the given string.
Find the sum of digits in a number.
Traverse from back to front in a given array.
Given an array of N random two-digit numbers, multiply each number with M and print the last 2 digits of each product. 
Give your suggestions for improving a code having Big (O) complexity.
Remove the subsequent duplicate characters in a string until you get a unique set of characters.
Write a function that will print tell the user if a number is divisible by 8, 16, or 32.
Find duplicate numbers from a given array.
Implement the Quicksort algorithm on the given linked list.*/
