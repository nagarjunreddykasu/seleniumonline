package collections;

import java.util.ArrayList;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor5");
		al2.add("Vendor6");
		al2.add("Vendor7");
		al2.add("Vendor3");
		al2.add("Vendor1");
		
		//retainAll()
		al1.retainAll(al2);
		System.out.println(al1);
		
	}

}
