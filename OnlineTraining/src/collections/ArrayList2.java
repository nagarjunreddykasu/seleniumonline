package collections;

import java.util.ArrayList;

//add()
public class ArrayList2 {
	public static void main(String[] args) {
		//generic version
		ArrayList<String> al=new ArrayList<>();
		al.add("Vendor4");
		al.add("Vendor2");
		al.add("Vendor1");
		al.add("Vendor3");
		
		al.add(2, "Vendor5");
		System.out.println(al);
		
	}

}
