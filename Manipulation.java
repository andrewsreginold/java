package activity;

public class Manipulation {

	public static void main(String []args)
	{
		String s="Andrews Reginold ";
		int len=s.length();
		System.out.println("String length is:"+len);
		char c=s.charAt(4);
		System.out.println("character is "+c);
		String str=Character.toString(c);
		char s1[]=new char[s.length()];
		s.getChars(0, 7, s1, 0);
		System.out.println(s1);
		int compare=s.compareTo(str);
		System.out.println("compare result is "+compare);
		System.out.println("value returned: "+s.startsWith("A"));
		System.out.println("value returned: "+s.endsWith("r"));
		System.out.println("index found at: "+s.indexOf('d'));
		System.out.println("index end at: "+s.lastIndexOf('d'));
		System.out.println("substring of: "+s.substring(7));
		System.out.println("concate string is : "+s.concat(str));
		System.out.println("replaced string is : "+s.replace('A','a'));
		System.out.println("uppercase string is : "+s.toUpperCase());
		System.out.println("lowercase string is : "+s.toLowerCase());
        System.out.println("trimmed string is : "+s.trim());
        char ch1[]=str.toCharArray();
		System.out.println("character array is: "+ch1);
		System.out.println("ignorecase result is "+s.equalsIgnoreCase(s.toLowerCase()));
		
		
	}
}
