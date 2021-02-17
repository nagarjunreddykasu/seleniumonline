package collections;

import java.util.ArrayList;

public class ArrayList8 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		al1.add("Vendor5");
		al1.add("Vendor6");
		al1.add("Vendor7");
		
		ArrayList<String> al=new ArrayList<>(al1.subList(2, 5));
		System.out.println(al);
	}

}
