package arrays;

public class ArraysDemo3 {
	static int[] getArray(){
		int[] arr=new int[]{5,10,15,20,25,30};
		return arr;
	}
	
	public static void main(String[] args) {
		int[] obj=ArraysDemo3.getArray();
		
		for(int i:obj){
			System.out.println(i);
		}
		
	}

}
