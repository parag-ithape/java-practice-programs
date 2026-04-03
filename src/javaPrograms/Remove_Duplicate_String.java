package javaPrograms;

import java.util.*;

public class Remove_Duplicate_String {

	public static void main(String[] args) 
	{
		
		String str="parag";
		str=str.toLowerCase();
		String Checkedchar="";
		String duplicates="";
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Checkedchar.indexOf(ch)==-1)  // indexOf()==-1 --> charcter is not present
			{
				Checkedchar +=ch;
			}
			else if(duplicates.indexOf(ch)==-1)  // indexOf()==-1 --> charcter is not present
			{
				duplicates +=ch;
			}
		}
		   // System.out.println(Checkedchar); // for print string without duplicate element
		    
		    String Output= String.join(",", duplicates.split(""));
		    System.out.println("Duplicate Elements is "+ Output );
		
		
		
	}

}
