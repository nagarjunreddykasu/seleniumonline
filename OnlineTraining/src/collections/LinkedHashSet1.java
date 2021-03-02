package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Element1");
		lhs.add("Element2");
		lhs.add("Element3");
		lhs.add("Element4");
		lhs.add("Element5");
		lhs.add("Vendor");
		lhs.add("Selenium");
		
		System.out.println(lhs);
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Üsing for each loop ***");
		for(String str:lhs){
			System.out.println(str);
		}
		
	}

}
