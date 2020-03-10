package activity;
import java.util.*;
public class Deque {

	public static void main(String[]args)
	{
		ArrayDeque<Double> tr=new ArrayDeque<Double>();
		Double tr1 = new Double(11.2);
		Double tr2 = new Double(34.4);
		Double tr3 = new Double(23.3);
		Double tr4 = new Double(45.6);
		
		System.out.println("Size of ArrayDeque is "+tr.size());
		
		tr.add(tr1);
		tr.add(tr2);
		
		System.out.println("ArrayDeque after adding elements: "+tr);
		
		System.out.println("Size of ArrayDeque is "+tr.size());
		
		tr.addFirst(tr3);
		tr.addLast(tr4);
		
		System.out.println("ArrayDeque after adding  elements at first and last: "+tr);
		
		System.out.println("Size of ArrayDeque after adding  elements at first and last "+tr.size());
		
		tr.removeFirst();
		System.out.println("ArrayDeque after removing  elements at first : "+tr);
		
		System.out.println("Size of ArrayDeque after removing  elements at first  "+tr.size());
		
}
}