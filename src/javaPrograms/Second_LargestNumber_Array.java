package javaPrograms;

public class Second_LargestNumber_Array
{
	 public static void main(String[] args) {
	        int[] numbers = {4, 2, 7, 5, 9, 1, 8,10,15};

	    /*    if (numbers.length < 2) 
	        {
	            System.out.println("Array must contain at least two elements.");
	            return;
	        }  */

	        int firstLargest, secondLargest;
	        firstLargest = secondLargest = Integer.MIN_VALUE;

	        for (int num : numbers) 
	        {
	            if (num > firstLargest) 
	            {
	                secondLargest = firstLargest;
	                firstLargest = num;
	            } 
	            else if (num > secondLargest && num != firstLargest) 
	            {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) 
	        {
	            System.out.println("There is no second largest element in the array.");
	        } 
	        else 
	        {
	            System.out.println("The second largest number in the array is: " + secondLargest);
	        }
	    }
	}

/*	Explanation:
	Array Initialization: The array numbers is initialized with some integers.
	Edge Case Handling: If the array contains less than two elements, the program prints a message and exits.
	Initialize Variables: firstLargest and secondLargest are initialized to Integer.MIN_VALUE to ensure any number in the array will be larger.
	Iterate Through the Array: The program iterates through each element in the array:
	If the current number is greater than firstLargest, the current firstLargest becomes the secondLargest, and the current number becomes the firstLargest.
	If the current number is not equal to firstLargest but is greater than secondLargest, it becomes the new secondLargest.
	Check Result: After the loop, if secondLargest is still Integer.MIN_VALUE, it means there was no second largest element in the array. Otherwise, it prints the second largest number.
	You can run this program by copying it into a Java environment and executing it. The array numbers can be modified to test with different inputs.
	
	
Interview Programs
Count the number of characters in a given string.
Given a 2D matrix, find the shortest path between 2 points.
Given an array, subtract a number M from every odd index and N from every even index. 
From a series of numbers, locate the groups of numbers whose sum equals N.
Given a set of numbers, find the leaders in the series. (An element is a leader if it is greater than all the elements to its right).
What is a doubly circular linked list?
Convert the given binary number into decimal.
Given a string, remove the consecutively repeated characters. For example - aabbbcabcbb to cabc.
Divide a linked list into groups of K and reverse the numbers in every group.
Given two strings, find their union.
Check if the parentheses are balanced in the given string.
Write a code to implement a hash map.  
Given a sentence as a string, reverse each of the words without using inbuilt functions.
Write a code to group the positive and negative numbers.
Find the second largest number in the array.
Find the prime numbers of the numbers present in a given list.
Given an array, locate the three greatest numbers and print their product. 
Write a code to reverse a string without changing the position of the special characters.
In a given string containing 1s and 0s, find the number of 1s.
Write a code to convert a string such as aaabbccdaa to a3b2c2d1a2.*/