package collections;

import java.util.Hashtable;

public class Hashtable3 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(4, "Vendor4");
		ht.put(1, "Vendor1");
		ht.put(2, "Vendor2");
		ht.put(5, "Vendor5");
		ht.put(3, "Vendor3");
		
		
		Hashtable<Integer,String> ht2=new Hashtable<>();//ht
		ht2.putAll(ht);
		ht2.put(6, "Vendor6");
		System.out.println(ht2);
		
	}

}
