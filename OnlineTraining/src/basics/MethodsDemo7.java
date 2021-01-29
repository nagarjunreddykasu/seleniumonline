package basics;

public class MethodsDemo7 {
	//instance variables
	String username,password;
	
	void credentials(String username, String password){
		System.out.println(username+"\t"+password);
		
		this.username=username;
		this.password=password;
	
	}
	
	void login(){
		System.out.println("Values of instance variables: "+username+" ------ "+password);
	}
	
	public static void main(String[] args) {
		MethodsDemo7 obj=new MethodsDemo7();
		obj.credentials("nagarjun@gmail.com", "Test@123");
		obj.login();
	}

}
