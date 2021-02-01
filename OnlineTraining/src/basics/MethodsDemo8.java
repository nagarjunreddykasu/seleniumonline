package basics;

//methods with return type
public class MethodsDemo8 {
	
	void method1(){
		System.out.println("method1 without returning any value");
		
	}
	
	//Methods can have return tyme Primitive (byte short, char, int long float double boolean)
	int method2(int a, int b){
		int sum=a+b;
		System.out.println("Sum: "+sum);
		return sum;
	}
	
	boolean isValid(){
		
		return true;
	}
	
	short method3(){
		return (byte)10;
	}
	
	
	public static void main(String[] args) {
		MethodsDemo8 obj=new MethodsDemo8();
		int sum=obj.method2(20, 30);
		System.out.println("Addition value: "+sum);
		
		boolean bool=obj.isValid();
		System.out.println("Boolean value: "+bool);
		
		short sh=obj.method3();
		
	}

}
