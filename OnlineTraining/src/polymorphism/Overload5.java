package polymorphism;

public class Overload5 {
	
	void method1(int a){
		System.out.println("one int paramter");
	}
	void method1(int... i){
		System.out.println("var-arg parameter"+i);
	}
	
	public static void main(String[] args) {
		Overload5 obj=new Overload5();
		obj.method1(25);
		obj.method1(25,30,35,40);
		obj.method1(1,2,3);
		obj.method1((byte)10);
	}

}

// method1(int... i) //var-arg parameter