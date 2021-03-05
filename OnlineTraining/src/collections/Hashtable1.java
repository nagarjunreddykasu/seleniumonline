package collections;

import java.util.Hashtable;
public class Hashtable1 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(4, "Vendor4");
		ht.put(1, "Vendor1");
		ht.put(2, "Vendor2");
		ht.put(5, "Vendor5");
		ht.put(3, "Vendor3");
		
		System.out.println(ht);
		
		System.out.println(ht.get(3)); //putIfAbsent(), getOrDefault(), contains(), containsKey(), containsValue()
		
		
		
		
	}

}
