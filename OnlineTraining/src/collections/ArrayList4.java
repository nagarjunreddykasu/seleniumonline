package collections;

import java.util.ArrayList;

public class ArrayList4 {
	
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		
		//isEmpty
		
		System.out.println(al1.isEmpty());//false
		//clear
		al1.clear();
		System.out.println(al1.isEmpty());//true
	}

}
