package basics;

public class MethodsDemo3 {
	
	void add(){
		System.out.println("add method without parameters");
	}
	
	void add(int a, int b){
		System.out.println("Sum of two numbers: "+(a+b));
	}
	
	
	
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();
		obj.add();
		obj.add(10, 30);
		
	}

}


