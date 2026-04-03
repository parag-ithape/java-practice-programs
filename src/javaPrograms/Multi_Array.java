package javaPrograms;

public class Multi_Array 
{

	static void maxproductpair(int arr [],int n) 
	{
		if(n<2)
		{
			System.out.println("short array pair does not exsist");
		}
		// Initialize max product pair 
		int a=arr[0];
		int b=arr[1];

		// Traverse through every possible pair 
		// and keep track of max product 
		for(int i=0;i<n;i++) 
			for(int j=i+1;j<n;j++) 
				if(arr[i]*arr[j]>a*b)
				{
					a=arr[i];
					b=arr[j];
				}
		System.out.println("Max product pair is {"+a+","+b +"}");

	}

	static void secondlagrestpair(int arr[],int n)
	{
		if(n<2)
		{
			System.out.println("Pair not found");	
		}

		int a=arr[0];
		int b=arr[1];
		int c=0,d=0;

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n-1; j++) 
			{

				if(arr[i]*arr[j]>a*b) 
				{
					c=a;
					d=b;
					a=arr[i];
					b=arr[j];
				}
				if(arr[i] * arr[j] < a * b && arr[i] * arr[j] > c * d) 

					c=arr[i];
				d=arr[j];	 

			}
		System.out.println("Second Largest pair is {" + c +","+ d +"}");

	}


	public static void main(String[] args) 
	{

		int  arr[]= {1, 4, 3,5,8};;
		int n=arr.length;
		maxproductpair(arr,n);
		secondlagrestpair(arr,n);


		// Array for find pair with multiplication of product
		/*	int product=30;
	  int  arr[]= {1,2,8,9,15,21,23};
	  for(int i=0;i<arr.length;i++)
	  {

		  for(int j=1;j<arr.length;j++) 
		  {

			  if(arr[i]*arr[j]==product)
			  {
				  System.out.println("product of "+ arr[i] + "and" + arr[j]+ "is"+ product );
			  }

		  }*/
	}

}
