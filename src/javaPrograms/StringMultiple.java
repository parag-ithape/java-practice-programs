package javaPrograms;

public class StringMultiple
{
	public static void main (String [] agrs) 
	{
		String str="abcd";
		String str1="";
		for(int i=0;i<str.length(); i++)
		{
			char ch= str.charAt(i);
			for(int j=0; j<=i;j++) 
			{
				str1 +=ch;
			}	
		}
		System.out.println(str1);	
	}

}
