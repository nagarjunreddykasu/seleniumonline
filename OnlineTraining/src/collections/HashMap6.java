package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap6 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		hm.put("login", "Login value");
		
		
		//TO get all the key names
		Set<String> keys=hm.keySet();
		
		System.out.println("*** All the Keys ***");
		
		for(String str:keys){
			System.out.println(str);
		}
		
		System.out.println("*** All the Values ***");
		Collection<String> value=hm.values();
		for(String val:value){
			System.out.println(val);
		}
		
		System.out.println("*** All the Entries ***");
		Set<Entry<String, String>> entries=hm.entrySet();
		for(Entry<String, String> entry:entries){
			System.out.println(entry);
		}
		
		
	}

}