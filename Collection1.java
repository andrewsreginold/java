package activity;
import java.util.*;
public class Collection1 {

	public static void main(String[]args)
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		Integer tr1 = new Integer(112);
		Integer tr2 = new Integer(114);
		Integer tr3 = new Integer(113);
		Integer tr4 = new Integer(116);
		
		System.out.println("Size of TreeSet is "+tr.size());
		
		tr.add(tr1);
		tr.add(tr2);
		tr.add(tr3);
		tr.add(tr4);
		tr.add(tr1);
		
		System.out.println("Treeset after adding elements: "+tr);
		
		System.out.println("Size of TreeSet is "+tr.size());
		
		tr.remove(tr3);
		tr.remove(tr4);
		
		System.out.println("Treeset after removing elements: "+tr);
		
		System.out.println("Size of TreeSet after removing elements is "+tr.size());
		
		System.out.println("The final treeset is: ");
		
		Iterator i=tr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
}
