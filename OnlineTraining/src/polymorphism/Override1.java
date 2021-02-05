package polymorphism;

//child class
public class Override1 extends Overridden1{
	//overrding method
	public void login(){
		System.out.println("child class login method");
	}
	
	public void click(){ //Cannot reduce the visibility of the inherited method from  Overridden1
		System.out.println("child class click method");
	}
	public void getText(){
		System.out.println("Child class getText method");
	}
	
	
	public static void main(String[] args) {
		Override1 obj=new Override1();
		obj.login();
		
		Overridden1 obj2=new Overridden1();
		obj2.login();
		
		Overridden1 obj3=new Override1();
		obj3.login();
	}

}
