package collections;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Element5");
		ts.add("Element1");
		ts.add("Element4");
		ts.add("Element2");
		ts.add("Element3");
		
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<>();
		ts2.addAll(ts);
		ts2.add("Vendor");
		ts2.add("Selenium");
		
		System.out.println(ts2);
		
	}

}
