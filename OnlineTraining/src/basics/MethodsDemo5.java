package basics;

public class MethodsDemo5 {
	
	void method1(){
		System.out.println("method1");
	}
	void method2(){
		System.out.println("method2");
	}
	void method3(){
		method1();
		method2();
		System.out.println("method3");
	}
	
	public static void main(String[] args) {
		MethodsDemo5 obj=new MethodsDemo5();
		obj.method3();
		
	}

}
