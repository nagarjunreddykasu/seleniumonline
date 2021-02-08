package polymorphism;

public class SuperVariables extends SuperParent{
	//instance variables
	String username="Instance User",password="Instance Password";
	
	//instance method
	void login(String username,String password){ //local variables
		System.out.println(username+"\t"+password); //local variables
		System.out.println(this.username+"\t"+this.password);//calling instance variables
		System.out.println(super.username+"\t"+super.password);
	}
	
	public static void main(String[] args) {
		SuperVariables obj=new SuperVariables();
		obj.login("Local User", "Local Password");
	}

}
