package basics;

public class MethodsDemo12 {
	
	public void login(){
		System.out.println("login method");
	}
	public void searchProduct(){
		System.out.println("Searching for Product");
	}
	public void selectProduct(){
		System.out.println("Selecting a Product");
	}
	public void billing(){
		System.out.println("Billing...");
	}
	
	//Template method
	public void purchase(){
		System.out.println("Purchase Method");
		login();
		searchProduct();
		selectProduct();
		billing();
	}
	
	public static void main(String[] args) {
		//Normal approach
		MethodsDemo12 obj=new MethodsDemo12();
	/*	obj.login();
		obj.searchProduct();
		obj.selectProduct();
		obj.billing();*/
			
		obj.purchase();  //calling template method

	}

}
