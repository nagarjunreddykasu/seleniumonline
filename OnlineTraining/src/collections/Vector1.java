package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("Vendor5");
		vector.add("Vendor2");
		vector.add("Vendor4");
		vector.add("Vendor1");
		vector.add("Vendor3");
		
		System.out.println(vector);
		
		System.out.println("*** Using Enumeration ***");
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println("*** Using Iterator ***");
		Iterator<String> itr=vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
