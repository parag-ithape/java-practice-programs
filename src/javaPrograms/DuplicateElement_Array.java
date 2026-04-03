package javaPrograms;


import java.util.*;


public class DuplicateElement_Array {

	public static void main(String[] args)
	{
		String names[]= {"parag","prajakta","vaibhav","shubham","sayali","aditi","namrata","juiee","juiee","parag"};
		//1. using for loop
		
		for(int i=0;i<names.length;i++) 
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j])) 
				{
					System.out.println("Duplicate Elements is ::"+ names[i]);
				}	
			}
		}
		
		System.out.println("***********************************");
		
		//2. using HashSet
		
	    Set<String>store=new HashSet<String>();
	    for(String name:names) {
	    	if(store.add(name)== false) 
	    	{
	    		System.out.println("Duplicate Element is "+ name);
	    	}
	    }
	    System.out.println("Array after removing duplicate"+ store);

	}

}
