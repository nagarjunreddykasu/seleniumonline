package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Vendor4");
		al1.add("Vendor2");
		al1.add("Vendor1");
		al1.add("Vendor3");
		al1.add("Vendor5");
		al1.add("Vendor6");
		al1.add("Vendor7");
		
		
		System.out.println("ArrayList Data before sorting:");
		for(String str:al1){
			System.out.println(str);
		}
		
		
		//Sorting ArrayList in Ascending order
		Collections.sort(al1);
		
		System.out.println("ArrayList data after sorting");
		for(String str:al1){
			System.out.println(str);
		}
		
		//Sorting ArrayList data in descending order
		/*System.out.println("ArrayList data after sorting in descending order");
		Collections.sort(al1, Collections.reverseOrder());
		for(String str:al1){
			System.out.println(str);
		}*/
		
		System.out.println("ArrayList data after sorting in descending order using reverse()");
		Collections.reverse(al1);
		for(String str:al1){
			System.out.println(str);
		}
		//javap java.util.Collections
		
		
	}

}
