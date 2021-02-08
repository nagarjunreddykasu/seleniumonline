package polymorphism;

public class SuperMethods extends MethodsParent{
	void login(){
		System.out.println("Child class Login method");
	}
	
	//instance method
	void click(){
		login();//calling current class login method
		super.login();// calling parent class login method
	}
	
	public static void main(String[] args) {
		SuperMethods obj=new SuperMethods();
		obj.click();
		
	}

}
