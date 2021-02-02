package basics;

public class MethodsDemo13 {
	
	public void login(Dashboard db){
		System.out.println(db.a+"\t"+db.b);
		System.out.println(db.username+"\t"+db.password);
		db.dashboard();
	}
	
	public static void main(String[] args) {
		/*MethodsDemo13 obj=new MethodsDemo13();
		Dashboard dash=new Dashboard();
		obj.login(dash);*/
		
		
		new MethodsDemo13().login(new Dashboard());
		
		
		
	}

}


//methods with parameters as primitive types

// void method1(Dashboard d)