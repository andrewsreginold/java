package activity;

import java.util.Scanner;
import java.util.regex.*;

public class demoa {

public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your email address");
	String email=s.nextLine();
	Pattern pat=Pattern.compile("^[a-z]+[a-z.0-9-]+@[a-z.-]+(\\.[A-Za-z0-9]+)$");
	Matcher m1=pat.matcher(email);
	System.out.println("Enter your email password");
	String pass=s.nextLine();
	Pattern passp=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[a-z])(?=.*[@#$%^&])$");
	Matcher m2=passp.matcher(pass);
	boolean b=m1.matches();
	boolean b1=m2.matches();
	
	
	if(b==true && b1==true)
	{
		System.out.println("email and password is valid");
	}
	else if (b==false)
	{
		System.out.println("email is not valid");
	}
	else if(b1==false)
	{
		System.out.println("pasword is not valid");
	}
	else
	{
		System.out.println("email and password is not valid");
	}
}
}
