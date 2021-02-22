package collections;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> linked=new LinkedList<>();
		linked.add("Vendor5");
		linked.add("Vendor2");
		linked.add("Vendor4");
		linked.add("Vendor1");
		linked.add("Vendor3");
		
		
		linked.addFirst("Vendor6");
		linked.addLast("Vendor7");
		linked.add(1,"Vendor8");
		
		System.out.println(linked);
		linked.removeFirst();
		linked.removeLast();
		System.out.println(linked);
		
		System.out.println(linked.get(0));
		
		System.out.println(linked.size());
		
		linked.set(0, "VENDOR_8");
		System.out.println(linked);
		
		
	}

}
