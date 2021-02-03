package basics;

public class Constructor2 {
	public String username,password; //instance variables
	
	Constructor2(){
		username="Test User";
		password="Test@123";
		
	}
	
	Constructor2(String username,String password){ //local variables
		this.username=username;
		this.password=password;
		
	}
	
	public static void main(String[] args) {
		Constructor2 obj=new Constructor2();
		System.out.println(obj.username+"\t"+obj.password);
		
		Constructor2 obj1=new Constructor2("nagarjun.sdet@gmail.com","Abc@321");
		System.out.println(obj1.username+"\t"+obj1.password);
		
	}
	
	
	

}
