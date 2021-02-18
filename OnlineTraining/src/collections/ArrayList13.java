package collections;

import java.util.ArrayList;

public class ArrayList13 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		al1.add("Vendor5");
		al1.add("Vendor6");
		al1.add("Vendor7");
		
		
		String[] arr=new String[al1.size()];
		al1.toArray(arr);
		
		System.out.println(arr);
		for(String str:arr){
			System.out.println(str);
		}
		
	}

}
