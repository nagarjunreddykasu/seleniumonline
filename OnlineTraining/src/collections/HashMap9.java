package collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap9 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(1, "Vendor1");
		hm1.put(2, "Vendor2");
		hm1.put(3, "Vendor3");
		hm1.put(4, "Vendor4");
		hm1.put(5, "Vendor5");
		
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(4, "Vendor4");
		hm2.put(1, "Vendor1");
		hm2.put(2, "Vendor2");
		hm2.put(5, "Vendor5");
		hm2.put(6, "Vendor3");
		
		//To verify two HashMaps are equal or Not
		System.out.println(hm1.equals(hm2));
		
		//To Verify whether all the keys from two HashMaps are equal or not
		System.out.println(hm1.keySet().equals(hm2.keySet())); //true
		
		HashSet<Integer> hs=new HashSet<>();
		hs.addAll(hm1.keySet());
		hs.addAll(hm2.keySet());
		
		//To retrieve unmatched keys from first HashMap after comparing with second HashMap
		//hs.removeAll(hm2.keySet());
		
		//To retrieve unmatched keys from second HashMap after comparing with first HashMap
		//hs.removeAll(hm1.keySet());
		
		
		System.out.println(hm1.values().containsAll(hm2.values()));// true
		System.out.println(hm2.values().containsAll(hm1.values()));// true
		
		System.out.println(hs);
		
		
		
		
	}

}
