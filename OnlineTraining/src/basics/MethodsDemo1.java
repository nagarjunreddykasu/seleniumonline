package basics;

public class MethodsDemo1 {
	
	//instance method
	public void method1(){
		//instance area
		System.out.println("instance method");
	}
	
	//static method
	public static void method2(){
		//static area
		System.out.println("static method");
	}
	
	//instance method
	public void instanceMethod(){
		//instance area
		method1();
		
	}
	
	
	
	public static void main(String[] args) {
		//static area
		//Object Creation
		//1.Named object
		//syntax: classname reference-variable=new classname();
		MethodsDemo1 obj=new MethodsDemo1();
		obj.method1();
		
		obj.instanceMethod();
		
		//2. Nameless Object
		//syntax: new classname();
		
		new MethodsDemo1().method1();
		
		MethodsDemo1.method2();
		//Reusable.click("locator");
		
		
		
		
		
	}

}


//instance method
//static method

/*
syntax:
	[modifier] return-type method-name(parameterslist) throws exception{
	
	public private protected default
	void
	int String float boolean
	login()
}

*/

