package basics;

public class MethodsDemo4 {
	
	void method1(byte b){
		System.out.println("Byte value: "+b);
	}
	
	void method2(short s){
		System.out.println("Short value: "+s);
	}
	
	void method3(int i){
		System.out.println("Int value: "+i);
	}
	
	void method4(long l){
		System.out.println("Long value: "+l);
	}
	
	/*void method4(int i){
		System.out.println("Integer value: "+i);
	}*/
	
	
	public static void main(String[] args) {
		MethodsDemo4 obj=new MethodsDemo4();
		obj.method1((byte)15);
		obj.method2((short)20);
		obj.method3(50);
		obj.method4(60);
		
		
		
	}

}
