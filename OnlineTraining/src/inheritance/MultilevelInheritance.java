package inheritance;

public class MultilevelInheritance extends Parent2 {
	void method5(){
		System.out.println("method5 from MultilevelInheritance class");
	}
	void method6(){
		System.out.println("method6 from MultilevelInheritance class");
	}
	
	public static void main(String[] args) {
		MultilevelInheritance obj=new MultilevelInheritance();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
	}

}
