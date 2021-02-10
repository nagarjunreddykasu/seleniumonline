package arrays;

public class MulitdimensionalArray {
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4},{2,4,6,8},{1,3,5,7},{0,1,2}};
		
		System.out.println("Array Length: "+arr.length);//4
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);//3
		
		//Retrieving the values of multidimensional array using for loop
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("***** Using for each loop ******");
		for(int[] a:arr){
			for(int data:a){
				System.out.print(data+"\t");
			}
			System.out.println();
		}

		
		
	}

}

//output:
/*
1	2	3	4
2	4	6	8
1	3	5	7
0	1	2



 */

/*
Multidimensional Array:
 int[][] arr=new int[3][4]; //3*4=12
 
 		col1 		col2		col3		col4
 
 row1	arr[0][0]	arr[0][1]	arr[0][2]	arr[0][3]
 
 row2	arr[1][0]	arr[1][1]	arr[1][2]	arr[1][3]
 
 row3	arr[2][0]	arr[2][1]	arr[2][2]	arr[2][3]
 


*/