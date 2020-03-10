package com.hangman;

import java.util.Random;
import java.util.Scanner;

public class Demo extends Inputexception {
	
	void game()
	{
		
	int option = 0;
	int flag;
	Scanner sc=new Scanner(System.in);
	System.out.println("**************Hangman game************ ");
	System.out.println("1.playgame 2.instruction 3.exit");	
	System.out.println("Enter your choice :");
    
	option=sc.nextInt();
	
	switch(option)
	{
	case 1:
		playgame();
		break;

	case 2:
		instruction();
		break;
	case 3:
		exit();
	default:
		try
		{
		throw new Inputexception();
		}
		catch(Inputexception e)
		{
			dis();
			game();
		}
		}
		}
	void playgame()
	{
		int flag=0,ran,life=4,f=0;;
		String r;
		String s[]= {"orange","america","pink","canada","dubai","pitchblack","india","srilanka","malaysia","blue","violet","chennai","tuticorin","turquoise","quatar"};
        char guess;
        Random rd=new Random();
        ran=rd.nextInt(14);
        char[] fill=new char[s[ran].length()];
		for(int k=0;k<s[ran].length();k++)
		{
			System.out.print("- ");
		}		
		System.out.println();
		String str1;
		StringBuffer sb=new StringBuffer();
		System.out.println("life remaining:"+life);
		do
		{
         flag=0;
		 System.out.println("enter the guess word :");
		 Scanner sc1=new Scanner(System.in);
		 guess=sc1.next().charAt(0);
		 for(int i=0;i<s[ran].length();i++)
			{
				if(s[ran].charAt(i)==guess)
			{
			    flag=1;
				if(flag==1)
				{
					f++;
					int c=i+1;
					System.out.println("Hey you found a letter in the word at "+c+(" position"));
					fill[i]=guess;
			        }
				} 
			}
			System.out.println(fill);
			if(flag==0)
		      {
				life--;
		    	  System.out.println("wrong words are "+sb.append(guess)) ;
		    	  System.out.println("life remaining: "+life);
		    	  if(life==2)
		    	  {
		    		  System.out.println("Hey u already lost 2 chances,so do u want a clue:y/n");
		    		  String clue=new String();
		    		  Scanner sc2=new Scanner(System.in);
		    			clue=sc2.nextLine();
		    			if(clue.equalsIgnoreCase("y"))
		    			{
		    				System.out.println("Guessing word will be a country name or a color name");
		    			}
		    			else
		    			{
		    				continue;
		    			}
		    	  }
		    	  if(life==0)
		    	  {
		    		  System.out.println("********Sorry you lose the game*******");
		    		  System.out.println("Correct word is: "+s[ran]);
		    		  System.exit(0);
		    		 
		    	  }
		      }
		}
			while(f!=s[ran].length());
		    System.out.println();
			System.out.println("!!!!!!!!Congrats you found the word!!!!!!!!");
			System.out.println(fill);
		System.out.println("do you want to play again Y/n ?");
		Scanner sc2=new Scanner(System.in);
		r=sc2.nextLine();
		flag=0;
		if(r.equalsIgnoreCase("y"))
		{
		game();
	}		
		else
		{
			exit();
		}
	}
	void instruction()
	{
		System.out.println("game instruction");
	}
	void exit()
	{
		System.out.println("Thanks for playing");
		System.exit(0);
	}
public static void main(String[]args)
{
	Demo d=new Demo();
	d.game();
}}