package collections;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(4, "Vendor4");
		tm.put(1, "Vendor1");
		tm.put(2, "Vendor2");
		tm.put(5, "Vendor5");
		tm.put(3, "Vendor3");
		
		System.out.println(tm.containsKey(30));
		
		System.out.println(tm.containsValue("Vendor40"));
		
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());//1
		System.out.println(tm.lastKey());//5
		System.out.println(tm.lowerKey(3));//2
		System.out.println(tm.higherKey(3));//4
		
		SortedMap<Integer, String> sm=tm.headMap(3);
		System.out.println(sm);
		
		
		SortedMap<Integer, String> tail=tm.tailMap(3);
		System.out.println(tail);
		
		SortedMap<Integer, String> sub=tm.subMap(2, 4); //from key is inclusive and to key exclusive
		System.out.println(sub);
		
		
		
		Entry<Integer, String> entry=tm.pollFirstEntry();
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		System.out.println(tm);
		
		Entry<Integer, String> lastentry=tm.pollLastEntry();
		System.out.println(lastentry.getKey()+"\t"+lastentry.getValue());
		
		System.out.println(tm);
		
		
		
		
	}

}
