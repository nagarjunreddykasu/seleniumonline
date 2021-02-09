package interfaces;

public class InterfaceDemo implements Interface1,Interface2 {

	@Override
	public void click() {
		System.out.println("click method in class");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendKeys method in class");
		
	}

	@Override
	public void getText() {
		System.out.println("getText method in class");
		
	}
	
	public void waitForElement(){
		System.out.println("waitForElement method in class");
	}
	
	public static void main(String[] args) {
		InterfaceDemo obj=new InterfaceDemo();
		obj.click();
		obj.sendKeys();
		obj.getText();
		obj.getElement();
		Interface1.getWebElements();
		System.out.println(Interface1.a);
		obj.waitForElement();
		
		Interface1 obj2=new InterfaceDemo();
		obj2.click();
		obj2.sendKeys();
		obj2.getText();
		obj2.getElement();
		Interface1.getWebElements();
		System.out.println(Interface1.a);
		
	//	WebDriver --> interface
		//ChromeDriver FirefoxDriver InternetExplorerDriver HtmlUnitDriver SafariDriver
		
		//WebDriver driver=new ChromeDriver();
		
	
		
	}

	@Override
	public void waitForText() {
		
		
	}

	@Override
	public void getList() {
		
		
	}

}


/*
Interface:
All the methods are public and abstract by default.
All the variables are public static final
It is not possible to create object for interface.
Interface contains default and static methods with default implementation.


*/