package com.hangman;

public class Inputexception extends RuntimeException {

	void dis()
	{
	System.out.println("enter values between 1-3");
}
	
public static void main(String ags[])
{
	Inputexception d=new Inputexception();
	d.dis();

}
}