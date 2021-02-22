package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("Vendor5");
		vector.add("Vendor2");
		vector.add("Vendor4");
		vector.add("Vendor1");
		vector.add("Vendor3");
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Element1");
		al.add("Element2");
		al.add("Element3");
		
		
		
		
		Vector<String> vector2=new Vector<>(al);
		vector2.add("Vendor7");
		vector2.add("Vendor6");
		//vector2.addAll(vector);
		
		System.out.println(vector2);
		
		
		//using for each
		System.out.println("*** Using for each ***");
		for(String str:vector2){
			System.out.println(str);
		}
		
		
		
	}

}
