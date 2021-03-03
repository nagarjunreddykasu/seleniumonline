package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap8 {
	public static void main(String[] args) {
		HashMap<String,Search> hm=new HashMap<>();
		hm.put("first", new Search(111,"iPhone Mobile"));
		hm.put("second", new Search(222,"Samsung Mobile"));
		hm.put("third", new Search(333,"Lenovo Laptop"));
		
		
		Set<Entry<String, Search>> entries=hm.entrySet();
		Iterator<Entry<String, Search>>  itr=entries.iterator();
		System.out.println("*** Using Iterator cursor ***");
		while(itr.hasNext()){
			Entry<String, Search> ent=itr.next();
			System.out.println(ent.getKey());
			Search obj=ent.getValue();
			System.out.println(obj.id+"\t"+obj.name);
		}
		
	}

}


class Search{
	int id;
	String name;
	Search(int id,String name){
		this.id=id;
		this.name=name;
	}
}