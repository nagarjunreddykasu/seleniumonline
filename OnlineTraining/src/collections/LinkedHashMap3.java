package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		hm.put("login", "Login value");
		
		//To retrieve Keys and Values using Iterator
		Set<Entry<String, String>> entries=hm.entrySet();
		Iterator<Entry<String, String>>  itr=entries.iterator();
		System.out.println("*** Using Iterator cursor ***");
		while(itr.hasNext()){
			Entry<String, String> ent=itr.next();
			//System.out.println(ent);
			
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
		
		//To retrieve Keys and Values using for each loop
		
		System.out.println("*** Using for each loop ***");
		for(Entry<String, String> ent:hm.entrySet()){
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
	}

}
