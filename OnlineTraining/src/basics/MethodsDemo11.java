package basics;

//this keyword --> to represent current class instance variables and also, to represent current class object
public class MethodsDemo11 {
	
	MethodsDemo11 method1(){
		System.out.println("method1");
		MethodsDemo11 obj=new MethodsDemo11();
		return 	obj;
	}
	MethodsDemo11 method2(){
		System.out.println("method2");
		return this;
	}
	
	
	public static void main(String[] args) {
		MethodsDemo11 obj=new MethodsDemo11();
		MethodsDemo11 obj1=obj.method1();
		System.out.println(obj1);
		MethodsDemo11 obj2=obj.method2();
		System.out.println(obj2);
		
		
		
		
	}

}
