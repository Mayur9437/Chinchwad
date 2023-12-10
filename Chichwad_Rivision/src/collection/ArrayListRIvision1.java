	package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListRIvision1 
{

	public static void main(String[] args) 
	{
	
		ArrayList<Object> al= new ArrayList<>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Kolhapur");
		al.add("Nagpur");
		al.add("ANgar");
		al.add("Nashik");
		al.add("New Mumbai");
		al.add("Goregaon");
		al.add("Wakad");
		
		System.out.println(al);
		
		System.out.println("=====================For Loop=====================");
		
		for (int i = 0; i <=al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
		
		
		
		System.out.println("=====================For each Loop=====================");
		
		for (Object a: al) 
		{
			System.out.println(a);
		}
		
		
		
		System.out.println("=====================Itertor=====================");
		
		
		Iterator<Object> it = al.iterator();
		
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("=====================List Itertor=====================");
		System.out.println("=======================Forward========================");
		ListIterator<Object> it1 = al.listIterator();
		
		while (it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("=======================Previous========================");
		
		while (it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
	}
	
}
