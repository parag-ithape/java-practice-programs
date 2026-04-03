package javaPrograms;

public class Reverse_integer {

	public static void main(String[] args) 
	{

    long num=54321; 
    long rev=0;
    
    while(num!=0) 
    {
    
    	rev=rev*10 + num%10;
    	num=num/10;	
    }
    System.out.println("Revrese Number is "+ rev);

    //2.Using StringBuffer
     long num1=789456123;
     System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
     
    
	}

}
