package javaPrograms;

public class Reverse_String {

	public static void main(String[] args) 
	{

     String str="amazon";
     //1. Using for loop
     int len=str.length();
     String rev="";
     
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+str.charAt(i);
     }
     System.out.println(rev);
     
     //2.using StringBuffer class
     StringBuffer sf=new StringBuffer(str);
     
       System.out.println(sf.reverse());
     
     
	}
	
	

}
