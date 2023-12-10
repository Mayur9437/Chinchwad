package collection;

import java.util.HashSet;

public class HashSetRivision 
{
	public static void main(String[] args) 
	{
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Nagpur");
		hs.add("Null");
		hs.add("Delhi");
		
		System.out.println(hs);
		
//		hs.clear();
		
//		System.out.println(hs);
		
//		hs.clone();

		System.out.println(hs.contains("Mumbai"));
		
		System.out.println(hs.isEmpty());
		
		
		
		
		
	}
}
