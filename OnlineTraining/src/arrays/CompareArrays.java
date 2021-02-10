package arrays;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		int[] arr1={5,10,15,20,25};
		int[] arr2={5,10,15,20,25};
		
		
		Object[] obj1={arr1};
		Object[] obj2={arr2};
		
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("Both arrays are equal..");
		}
		else{
			System.out.println("Both arrays are NOT equal");
		}
		
		if(Arrays.equals(obj1, obj2)){
			System.out.println("Both arrays are equal..");
		}
		else{
			System.out.println("Both arrays are NOT equal");
		}
		
		
		if(Arrays.deepEquals(obj1, obj2)){
			System.out.println("Both arrays are equal..");
		}
		else{
			System.out.println("Both arrays are NOT equal");
		}
		
	}

}
