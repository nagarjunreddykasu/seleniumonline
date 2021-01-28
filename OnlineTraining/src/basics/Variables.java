package basics;


//Assignment: define 2 instance variables and 2 static variables, call those variables inside instance method and static method.
// call those instance & static methods in main method

public class Variables {
	//instance variable
	public int a=10;
	
	//static variable
	static int b=20;
	
	//instance method
	public void method1(){
		//instance area
		System.out.println(a);
		
		//accessing static variable inside instance area
		System.out.println(b);
		System.out.println(Variables.b);//recommended
		//create object 
		//classname refvariable = new classname();
		//Variables obj=new Variables();
		//System.out.println(obj.b);
	}
	
	public static void staticMethod(){
		//static area
		Variables obj = new Variables();
		System.out.println(obj.a);
		System.out.println(Variables.b);	
		
	}
	
	public static void main(String[] args) {
		//static area
		
		//accessing instance method in static method
		/*Variables obj=new Variables();
		obj.method1();
		
		System.out.println(obj.a);*/
		
		//accessing static method
		Variables.staticMethod();
		
		System.out.println(Variables.b);
	}

}


