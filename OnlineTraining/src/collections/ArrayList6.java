package collections;

import java.util.ArrayList;

public class ArrayList6 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		
		//set
		al1.set(2,"Vendor5");
		System.out.println(al1);
		
		//indexOf()
		int indexValue=al1.indexOf("Vendor3");
		System.out.println(indexValue);
		
		
		//get()
		System.out.println(al1.get(3));
		
		System.out.println("ArrayList size: "+al1.size());
		
		System.out.println(al1.contains("Vendor30"));
	}

}
