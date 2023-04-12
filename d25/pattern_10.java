package com.d25;

public class pattern_10 {
	
	public static void main(String[] args)
	{
		int counter=1;
		{
			for (int i = 1; i <= 5; i++) 
			{
		      
		      for (int j = 1; j <= i; j++) 
		      {
		        System.out.print(counter + " ");
		        counter++;
		      }
		      System.out.println();
			}
		}
	}

}
