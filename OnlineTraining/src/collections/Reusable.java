package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Reusable {
	public static ArrayList<String> compareArrayLists(ArrayList<String> expected,ArrayList<String> actual){
		Iterator<String> itr=expected.iterator();
		while(itr.hasNext()){
			String value=itr.next();
			if(actual.remove(value)){
				itr.remove();
			}
		}
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(expected);
		unmatched.addAll(actual);
		return unmatched;
		
	}
	
	
	public static HashMap<Integer,String> compareMaps(ConcurrentHashMap<Integer,String> hm1,ConcurrentHashMap<Integer,String> hm2){
		Set<Entry<Integer, String>> entries=hm1.entrySet();
		Iterator<Entry<Integer, String>>  itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			if(hm2.remove(entry.getKey(), entry.getValue())){
				hm1.remove(entry.getKey());
			}
		}
		HashMap<Integer,String> unmatched=new HashMap<>();
		unmatched.putAll(hm1);
		unmatched.putAll(hm2);
		return unmatched;
	}
	
	
}


// driver.findElement(By.id("submit")).click();