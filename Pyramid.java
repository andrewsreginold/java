package com.andrews;

import java.util.Scanner;

public class Pyramid {
public static void main(String[]args)
{
	int l=0,o=4;
	
	  for(int i=9;i>0;i=i-2)
	  {
		  l++;
		  for(int j=0;j<o;j++)
		  {
			  System.out.print(" ");
		  }
		 for(int k=1;k<=l;k++)
		  {
	
			 System.out.print(i+" ");
			
			
		  }
		 o--;
		  System.out.println();
		 
	  }
		  
}
}