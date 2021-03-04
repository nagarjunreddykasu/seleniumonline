package collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap11 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> hm1=new ConcurrentHashMap<>();
		hm1.put(1, "Vendor1");
		hm1.put(2, "Vendor2");
		hm1.put(3, "Vendor3");
		hm1.put(4, "Vendor4");
		hm1.put(5, "Vendor5");
		
		
		ConcurrentHashMap<Integer,String> hm2=new ConcurrentHashMap<>();
		hm2.put(4, "Vendor4");
		hm2.put(1, "Vendor1");
		hm2.put(2, "Vendor2");
		hm2.put(5, "Vendor5");
		hm2.put(6, "Vendor3");
		
		HashMap<Integer, String> unmatched=Reusable.compareMaps(hm1, hm2);
		System.out.println(unmatched);
		
		
		
	}

}
