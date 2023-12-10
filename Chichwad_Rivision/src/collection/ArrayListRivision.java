package collection;

import java.util.ArrayList;

public class ArrayListRivision 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Object> al  = new ArrayList<Object>();		
		
		al.add("hii");
		al.add(8723);
		al.add("dhfkhs");
		al.add(153);
		al.add("dhbjhf");
		al.add("4666");
		al.add(656);
		al.add("lalala");
		al.add(789);
		
		
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.indexOf(8723));
		
		System.out.println(al.remove(6));
		
		System.out.println(al.add(5565));
		
		System.out.println(al.remove(4));
		
		System.out.println(al);
	}
	
}
