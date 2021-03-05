package collections;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(4, "Vendor4");
		tm.put(1, "Vendor1");
		tm.put(2, "Vendor2");
		tm.put(5, "Vendor5");
		tm.put(3, "Vendor3");
		tm.put(null, "Vendor3");
		
		System.out.println(tm);
	}

}
