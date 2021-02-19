package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList10 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		al1.add("Vendor5");
		al1.add("Vendor6");
		al1.add("Vendor7");
		
		//System.out.println(al1);
		
		//1st way using for each loop
		System.out.println("*** Using for each loop ***");
		for(String str:al1){
			System.out.println(str);
		}
		
		//2n way using get()
		System.out.println("*** Using get() in for loop ***");
		for(int i=0;i<al1.size();i++){
			System.out.println(al1.get(i));
		}
		
		//3rd way using Iterator
		System.out.println("*** Using Iterator cursor ***");
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			String value=itr.next();
			if(value.equals("Vendor6")){
				itr.remove();
			}
			System.out.println(value);
		}
		
		//4th way using ListIterator
		System.out.println("Using ListIterator cursor");
		ListIterator<String> litr=al1.listIterator();
		litr.add("Vendor8");
		while(litr.hasNext()){
			//System.out.println(litr.next());
			String str=litr.next();
			if(str.equals("Vendor7")){
				//litr.remove();
				litr.set("VENDOR-7");
			}
			System.out.println(str);
		}
		
		System.out.println(al1);
		System.out.println("After modifications: ");
		for(String str:al1){
			System.out.println(str);
		}
	}

}


/*
Retrieving objects of Collection classes:
1. By using for each loop
2. Bu using get() in for loop
3. By using cursors

3 types if cursors in java
1. Enumeration
2. Iterator --> universal cursor
hasNext()
next()
remove()

3. ListIterator






*/