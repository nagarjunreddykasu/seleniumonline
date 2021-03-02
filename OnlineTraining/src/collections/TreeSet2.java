package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Element5");
		ts.add("Element1");
		ts.add("Element4");
		ts.add("Element2");
		ts.add("Element3");
		
		TreeSet<String> ts2=new TreeSet<>();
		ts2.addAll(ts);
		ts2.add("Vendor");
		ts2.add("Selenium");
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=ts2.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("*** Using for each loop");
		for(String str:ts2){
			System.out.println(str);
		}
		
		System.out.println("*** Using descending iterator ***");
		Iterator<String> desc=ts2.descendingIterator();
		while(desc.hasNext()){
			System.out.println(desc.next());
		}
		
		
	}

}
