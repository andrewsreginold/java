package activity;
import java.util.*;
public class Collectonhash {

	public static void main(String[]args)
	{
		HashMap<String, Integer> tr=new HashMap<String,Integer>();
		Integer tr1 = new Integer(112);
		Integer tr2 = new Integer(114);
		Integer tr3 = new Integer(113);
		Integer tr4 = new Integer(116);
		
		System.out.println("Size of HashMap is "+tr.size());
		
		tr.put("l1",tr1);
		tr.put("l2",tr2);
		tr.put("l3",tr3);
		tr.put("l4",tr4);
		
		System.out.println("HashMap ater adding elements is "+tr);
		System.out.println("Size of HashMap ater adding elements is "+tr.size());
		
		tr.remove("l3");
		tr.remove("l2");
		
		System.out.println("HashMap ater removing elements is "+tr);
		System.out.println("Size of HashMap ater removing elements is "+tr.size());
		
		
		
}}