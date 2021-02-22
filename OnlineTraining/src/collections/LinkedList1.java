package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList<String> linked=new LinkedList<>();
		linked.add("Vendor5");
		linked.add("Vendor2");
		linked.add("Vendor4");
		linked.add("Vendor1");
		linked.add("Vendor3");
		
		//4 ways for, for each, Iterator, ListIterator
		System.out.println(linked);
		
		System.out.println("Using for loop ***");
		for(int i=0;i<linked.size();i++){
			System.out.println(linked.get(i));
		}
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=linked.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
