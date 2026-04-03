package javaPrograms;

import java.util.Arrays;

public class Largest_Smallest_Number_InArray {

	public static void main(String[] args) 
	{
       
		int num[]= {9999,10,15,80,15,99,65,999,-88,785,-1};
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++) 
		{
			if(num[i]>largest) 
			{
				num[i]=largest;
			}
			else if (num[i]<smallest) 
			{
				smallest=num[i];
			}
		}
		System.out.println("Number of Array"+ Arrays.toString(num));// Arrays.toSting()---> Use for print Array
		System.out.println("Largest Number::"+ largest);
		System.out.println("Smallest Number::"+ smallest);
	}

}
