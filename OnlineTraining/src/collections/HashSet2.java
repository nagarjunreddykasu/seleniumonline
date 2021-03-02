package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");
		hs.add("Element2");
		hs.add("Element3");
		hs.add("Element4");
		hs.add("Element5");
		hs.add("Vendor");
		hs.add("Selenium");
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
