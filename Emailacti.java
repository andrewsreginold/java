package activity;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Emailacti {
	
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your email address");
		String email=s.nextLine();
		Pattern pat=Pattern.compile("[a-z.0-9-]+(?=.@(?=.[a-z]))");
		Matcher m1=pat.matcher(email);
		System.out.println("Enter your password");
		String mp=s.nextLine();
		Pattern pass=Pattern.compile("(?=.*[a-z]) (?=.[@#$%^&**])");
		Matcher mp1=pass.matcher(mp);
		boolean b=m1.matches();
		boolean bp=mp1.matches();
		
		if(b==true)
		{
		System.out.println("mail id and password is in correct format");
		
		
	}
	/*	else if(b==false)
		{
			System.out.println("password  is incorrect format ");
		}
		else if(b==false && bp==false)
		{
			System.out.println("mail id and password  is incorrect format ");
		*/}
		}
	
