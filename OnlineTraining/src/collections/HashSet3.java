package collections;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");
		hs.add("Element2");
		hs.add("Element3");
		hs.add("Element4");
		hs.add("Element5");
		hs.add("Vendor");
		hs.add("Selenium");
		
		HashSet<String> hs2=new HashSet<>(hs);
		//hs2.addAll(hs);
		hs2.add("Vendor");
		hs2.add("Vendor3");
		hs2.add("Vendor4");
		
		System.out.println(hs2);
		
		System.out.println("*** Using for each loop ***");
		for(String str:hs2){
			System.out.println(str);
		}
		
		hs2.clear();
		System.out.println(hs2);
		
		hs2.remove("Vendor");
		
		
	}

}
