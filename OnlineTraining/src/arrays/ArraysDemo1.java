package arrays;

public class ArraysDemo1 {
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		
		
		int[] arr=new int[5];//declaration
		
		arr[0]=10;//initialization
		arr[1]=15;
		arr[2]=20;
		arr[3]=25;
		arr[4]=30;
		
		//Retrieving values of array using for loop
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
		//another way
		int[] arr2={2,4,6,8,10,12,14};
		System.out.println("Size of arr2: "+arr2.length);
		
		//Retrieving values of array using for each loop
		for(int i:arr2){
			System.out.println(i);
		}
		
		
		
	}

}


/*
Arrays:

1. Single Dimensional Arrays

syntax:
datatype[] refvariable=new datatype[size];
OR
datatype refvariable[]=new datatype[size];

2. Multidimensional Arrays


*/