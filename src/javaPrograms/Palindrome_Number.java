package javaPrograms;

public class Palindrome_Number {

	public static void main(String[] args) 
	{
		
		palindromCheck(123);

	}
	public static void palindromCheck(int number)
	{
		
		int original=number;
		int reversed=0;
		while (number != 0) 
		{
            int digit = number % 10;
            reversed = reversed * 10+ digit;
            number /= 10;
        }
		if(original==reversed)
		{
			System.out.println("Number is a Palindrom");
		}
		else 
		{
			System.out.println("Number is Not a Palindrom");
		}
	}
}
