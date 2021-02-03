package basics;

public class Constructor1 {
	//0-arg constructor
	Constructor1(){
		System.out.println("o-arg constructor");
	}
	
	Constructor1(int i){
		System.out.println("1-arg int type constructor");
	}
	
	Constructor1(String username,String password){
		System.out.println(username+"\t"+password);
	}
	
	
	public static void main(String[] args) {
		Constructor1 obj=new Constructor1();
		//Constructor1 obj1=new Constructor1(50);
		
		new Constructor1(50);
		//new Constructor1("Nagarjun","Test@123");
		
	}
	
	

}


//classname refvariable=new classname(); //named object
//new classname(); //nameless
/*
 * 1. Constructor name and class name must be same
 * 2. it is possible to pass parameters to constructors
 * 3. Return type concept is not applicable for constructors
 * 4. Modifiers public,private,protected,default can be applicable for constructors
 * 
 * 1. Default Constructors ()
 * 2. User defined Constructors
 * 		i. 0-argument or no-arg constructor
 * 		ii. parameterized constructors
 */
