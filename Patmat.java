package activity;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Scanner;

public class Patmat {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter desired text: " );
		String s1=s.nextLine();
		Pattern mypattern=Pattern.compile(s1);
		System.out.println("Enter the matching string:");
		String m1=s.nextLine();
		Matcher mymatch=mypattern.matcher(m1);
		boolean b1=mymatch.matches();
		if(b1==true)
		{
			System.out.println("the text is: "+m1+" the text is found at: "+mymatch.start());
		}
		else
		{
			System.out.println("text not found");
		}
	}
	
}
