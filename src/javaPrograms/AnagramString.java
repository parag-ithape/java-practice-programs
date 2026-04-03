package javaPrograms;

public class AnagramString
{
	public static void main(String[] args) 
	{
		String str1 = "listen to ot"; // First string
		String str2 = "silent ot to"; // Second string

		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			return;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
       for (int i = 0; i < arr1.length - 1; i++)
		{
			for (int j = i + 1; j < arr1.length; j++) 
			{
				if (arr1[i] > arr1[j]) 
				{
					char temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
				if (arr2[i] > arr2[j]) 
				{
					char temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}

		// Compare the sorted arrays
		for (int i = 0; i < arr1.length; i++) 
		{
			if (arr1[i] != arr2[i]) 
			{
				System.out.println("The strings are not anagrams.");
				return;
			}
		}

		System.out.println("The strings are anagrams.");
	}

}
