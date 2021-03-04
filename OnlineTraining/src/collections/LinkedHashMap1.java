package collections;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm1=new LinkedHashMap<>();
		hm1.put(1, "Vendor1");
		hm1.put(2, "Vendor2");
		hm1.put(3, "Vendor3");
		hm1.put(4, "Vendor4");
		hm1.put(5, "Vendor5");
		
		System.out.println(hm1);
	}

}
