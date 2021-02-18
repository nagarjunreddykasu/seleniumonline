package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList12 {
	public static void main(String[] args) {
		String[] arr={"element1","element2","element3"};
		
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		al.add("element4");
		System.out.println(al);
		
		
		//Country dropdonw
		//India,England,United states,China
		String str="India,England,United states,China";
		String[] arr1=str.split(",");
		
		ArrayList<String> expected=new ArrayList<>(Arrays.asList(arr1));
		System.out.println("Expected Country name: "+expected);
		
	
		
	}

}
