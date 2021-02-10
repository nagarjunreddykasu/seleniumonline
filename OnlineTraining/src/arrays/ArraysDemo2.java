package arrays;

//Passing an array to Method
public class ArraysDemo2 {
	static void getArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr={10,20,30,40};
		ArraysDemo2.getArray(arr);
		
	}

}
