package basics;

public class MethodsDemo2 {
	
	public void instanceMethod(int a, char ch){
		System.out.println("Instance Method: "+a);
	}
	
	public static void staticMethod(double d){
		System.out.println("Static Method: "+d);
	}
	
	public static void click(String str){
		System.out.println("code to perform click action on "+str);
	}
	
	
	public static void main(String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.instanceMethod(10,'K');
		
		
		MethodsDemo2.staticMethod(55.75);
		
		MethodsDemo2.click("btnSubmit");
		
		
		
	}

}
