package javaPrograms;

public class NumberPattern {

	public static void main(String[] args) 
	{
	
		int n=5;
		boolean noreverse=false;
		
		if(noreverse) 
		{
			for (int i=1; i<=n;i++) 
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(j);	
				}
				System.out.println();	
			}
		}
		else
		{
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(j);
					
				}
				System.out.println();
				
			}
		}
		

	}

}
