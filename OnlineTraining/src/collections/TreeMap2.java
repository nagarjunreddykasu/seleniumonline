package collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(4, "Vendor4");
		tm.put(1, "Vendor1");
		tm.put(2, "Vendor2");
		tm.put(5, "Vendor5");
		tm.put(3, "Vendor3");
		
		Set<Entry<Integer, String>> entries=tm.entrySet();
		Iterator<Entry<Integer,String>> itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
		
		
	}
	

}
