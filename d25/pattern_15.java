package com.d25;

public class pattern_15 {
	
	public static void main(String[] args) 
	{
		for (int i=6-1;i>=1;i--) 
        {
            for (int j=1;j<=5-i;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
