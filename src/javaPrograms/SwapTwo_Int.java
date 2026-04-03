package javaPrograms;

public class SwapTwo_Int {

	public static void main(String[] args) 
  {
		
 // swap two Integer
	/*int a=10;
	  int b=80;
	1. Without using 3rd varible
	a=a+b; //90
	b=a-b; //10
	a=a-b; //80 
	
	2. with using third val
	int t;
	t=a;
	a=b;
	b=t;
	 System.out.println(a);
	 System.out.println(b);
	*/
	
	//swap two string
		String a="Hello";
		String b="Parag";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	

}
