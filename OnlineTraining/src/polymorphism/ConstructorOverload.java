package polymorphism;

public class ConstructorOverload {
	ConstructorOverload(){
		System.out.println("Constructor without paramter");
	}
	ConstructorOverload(String email){
		System.out.println("Constructor with one string paramter");
	}
	ConstructorOverload(String username,String parameter){
		System.out.println("Constructor with two string paramters");
	}
	
	public static void main(String[] args) {
		new ConstructorOverload();//calling constructor without parameters
		new ConstructorOverload("nagarjun.sdet@gmail.com");//calling constructor with one string parameter
		new ConstructorOverload("Test User","Abc@321");////calling constructor with two string parameters
	}

}
