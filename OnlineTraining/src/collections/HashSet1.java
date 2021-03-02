package collections;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");
		hs.add("Element2");
		hs.add("Element3");
		hs.add("Element4");
		hs.add("Element5");
		hs.add("Vendor");
		hs.add("Selenium");
		
		//System.out.println(hs);
		
		System.out.println(hs.add("Selenium automation"));//false true
		
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		/*HashSet<String> hs2=new HashSet<>();
		hs2.addAll(hs);
		
		hs2.add("Element6");
		
		System.out.println(hs2);
		
		hs2.add("Element5");*/
		
		
		
	}	

}
