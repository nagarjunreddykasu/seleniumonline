package basics;

public class MethodsDemo10 {
	
	Dashboard login(){
		System.out.println("login code");
		//Dashboard db=new Dashboard();
		return new Dashboard();
	}
	
	public static void main(String[] args) {
		MethodsDemo10 obj=new MethodsDemo10();
		Dashboard dash=obj.login();
		System.out.println(dash.a);
		System.out.println(dash.b);
		dash.dashboard();
		System.out.println(dash.username);
		System.out.println(dash.password);

	}

}


/*
methods without parameters
methods with parameters as primitive type
methods without returning values
methods with returning values
methods with returning variables

methods with returning user defined class object
methods with user defined class object as parameter
*/