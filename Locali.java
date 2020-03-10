package activity;
import java.text.NumberFormat;
import java.util.*;


public class Locali {
public static void main(String[]args)
{
	NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("in","IN"));
	String Formatted=nf.format(10000000);
	System.out.println(Formatted);
}

}
