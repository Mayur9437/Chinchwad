package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorRivision 
{
 public static void main(String[] args) 
 {

	 Vector<Integer> v = new Vector<>();
	 
	 v.add(1);
	 v.add(2);
	 v.add(3);
	 v.add(4);
	 v.add(5);
	 v.add(6);
	 v.add(7);
	 v.add(8);
	 v.add(9);
	 v.add(10);
	 v.add(11);
	 v.add(12);
	 v.add(13);
	 
//	 System.out.println(v.capacity());
	 
	 System.out.println(v);
	 
	 System.out.println("================For loop==============");
	 
	 for (int i = 0; i < v.size()-1; i++) 
	 {
		System.out.println(v.get(i));
		
	 }
	 
	 System.out.println("================For Each==============");
	 
	 for (Integer x : v)
	 {
		System.out.println(x);
 	 }
	 
	 System.out.println("================Itretor==============");
	 
	 Iterator<Integer> it = v.iterator();
	 
	 while (it.hasNext()) 
	 {
		System.out.println(it.next());
	 }
	 
	 System.out.println("================List Itretor==============");
	 
	 ListIterator<Integer> li = v.listIterator();
	 
	 while (li.hasNext())
	 {
		System.out.println(li.next());
		
	}
	 
	 System.out.println("================Previous ==============");
	 while (li.hasPrevious())
	 {
		 System.out.println(li.previous());
	 }
	 
	 System.out.println("================Enumration==============");
	 
	 Enumeration<Integer> el = v.elements();
	 
	 while(el.hasMoreElements())
	 {
		 System.out.println(el.nextElement());
	 }
	 
	 
	 
}
}
