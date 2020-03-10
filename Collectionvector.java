package activity;
import java.util.*;
public class Collectionvector {

	public static void main(String[]args)
	{
		Vector<Double> tr=new Vector<Double>();
		Double tr1 = new Double(11.2);
		Double tr2 = new Double(34.4);
		Double tr3 = new Double(23.3);
		Double tr4 = new Double(45.6);
		
		System.out.println("Size of vector is "+tr.size());
		
		tr.add(tr1);
		tr.add(tr2);
		tr.add(tr3);
		tr.add(tr4);
		tr.add(tr1);
		
		System.out.println("Vector after adding elements: "+tr);
		
		System.out.println("Size of Vector is "+tr.size());
		
		tr.remove(tr3);
		tr.remove(tr4);
		
		System.out.println("Vector after removing elements: "+tr);
		
		System.out.println("Size of Vector after removing elements is "+tr.size());
		
		System.out.println("The final Vector is: ");
		
		Iterator i=tr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
}
