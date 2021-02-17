package collections;

import java.util.ArrayList;

//addAll()
public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Vendor6");
		al2.add("Vendor7");
		
		
		/*al1.addAll(al2);
		System.out.println(al1);*/
		
		al1.addAll(2, al2);
		System.out.println(al1);
		
		ArrayList<String> al=new ArrayList<>();
		al.addAll(al1);
		System.out.println(al);
		
	}

}
