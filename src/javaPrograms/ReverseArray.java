package javaPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,9,8,7,5};
		int start=0;
		int end=arr.length-1;
		System.out.println("Original Array is :"+ Arrays.toString(arr));
		
		while(start<end) 
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		System.out.println("Reversed Array is :"+ Arrays.toString(arr));
		
		// 2nd approch to print array without inbuilt method
		
	/*	System.out.println("Reversed Array :");
		for(int num:arr)
		{

		 System.out.print(num+ " ");	
		} */
	}

}
