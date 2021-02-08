package encapsulation;

public class Login {
	
	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		obj.setUserName("Test User");
		obj.setPassword("Abc@321");
		
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
		
	}

}
