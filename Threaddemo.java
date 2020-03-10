package activity;

import java.util.Scanner;

public class Threaddemo {

	public static void main(String[]args) throws InterruptedException
	{
		int i;
		
		 
		for( i=5;i>=0;i--)
		{
			Thread.sleep(1000);
		System.out.print(" "+i);
		
		}
		if (i==0)
		
		{
			System.out.println();
			System.out.println("times up");
		}
		}
}
		
