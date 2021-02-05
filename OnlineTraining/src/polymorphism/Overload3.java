package polymorphism;

public class Overload3 {
	public void getInfo(String name,int age){
		System.out.println("String int paramters");
	}
	public void getInfo(int age,String name){
		System.out.println("int string parameters");
	}
	
	public static void main(String[] args) {
		Overload3 obj=new Overload3();
		obj.getInfo("TestUser", 30);
		obj.getInfo(25, "user2@gmail.com");
	}

}
