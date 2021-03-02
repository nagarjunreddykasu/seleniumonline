package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Element1");
		lhs.add("Element2");
		lhs.add("Element3");
		lhs.add("Element4");
		lhs.add("Element5");
		lhs.add("Vendor");
		lhs.add("Selenium");
		
		
		LinkedHashSet<String> lhs2=new LinkedHashSet<>(lhs);
		//lhs2.addAll(lhs);
		lhs2.add("Vendor2");
		
		System.out.println(lhs2);
		
		lhs2.remove("Vendor2");
		
		System.out.println(lhs2.size());
		
	}

}
