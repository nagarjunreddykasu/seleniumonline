package polymorphism;

//Different Number of parameters
public class Overload1 {
	
	public void click(){
		System.out.println("click method without parameters");
	}
	public void click(String str){
		System.out.println("click method with one parameter");
	}
	public void click(String username,String password){
		System.out.println("click method with two parameters");
	}
	
	public static void main(String[] args) {
		Overload1 obj=new Overload1();
		obj.click();
		obj.click("Nagarjun");
		obj.click("testuser", "Abc@123");
		
	}

}
