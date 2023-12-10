package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRivision 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<>();
		 a.add("a");
		 a.add("b");
		 a.add("c");
		 a.add("d");
		 a.add("e");
		 a.add("f");
		 a.add("g");
		 a.add("h");
		 a.add("i");
		 a.add("j");
		 a.add("k");
		 a.add("l");
		 
		 System.out.println(a);
		 
		 System.out.println("============================================================================");
		 Iterator<Object> i= a.iterator();
		 
		 while (i.hasNext())
		 {
			System.out.println(i.next());
		 }
		 
	}
}
