package wrapperclasses;

public class AutoBoxing {
	public static void main(String[] args) {
		int a=20; //primitive
		
		Integer i=Integer.valueOf(a);//converting int to Integer explicitly
		
		Integer j=a; //Autoboxing
		
		System.out.println(a+"\t"+i+"\t"+j);
		
		
		double d=20.75;
		
		Double db=d;
		
		
		
	}

}
