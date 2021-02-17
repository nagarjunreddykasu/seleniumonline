package collections;

import java.util.ArrayList;

public class ArrayList5 {
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		
		//remove
		al1.remove(2);
		System.out.println(al1);
		
		al1.remove("Vendor3");
		System.out.println(al1);
		
	}

}
