package collections;

import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm1=new TreeMap<>();
		tm1.put(4, "Vendor4");
		tm1.put(1, "Vendor1");
		tm1.put(2, "Vendor2");
		tm1.put(5, "Vendor5");
		tm1.put(3, "Vendor3");
		
		
		TreeMap<Integer,String> tm2=new TreeMap<>(); //tm1
		tm2.put(6, "Vendor6");
		tm2.putAll(tm1);
		
		System.out.println(tm2);
		
		
		
		
		
		
	}

}
