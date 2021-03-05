package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable2 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(4, "Vendor4");
		ht.put(1, "Vendor1");
		ht.put(2, "Vendor2");
		ht.put(5, "Vendor5");
		ht.put(3, "Vendor3");
		
		
		System.out.println(ht.keySet());
		
		System.out.println("----- Using Enumeration ----");
		Enumeration<Integer> keys=ht.keys();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
		
		
		System.out.println(ht.values());
		System.out.println("----- Using Enumeration ----");
		Enumeration<String>  value=ht.elements();
		while(value.hasMoreElements()){
			System.out.println(value.nextElement());
		}
		
		System.out.println("*** Using Iterator ***");
		Set<Entry<Integer,String>>  entries=ht.entrySet();
		Iterator<Entry<Integer, String>>  itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("*** Using for each loop ***");
		for(Entry<Integer,String> ent:entries){
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
		
		
		
	}

}
