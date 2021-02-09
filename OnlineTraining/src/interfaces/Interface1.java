package interfaces;

public interface Interface1 {
	int a=10; //public static final int a=10;
	
	void click(); //public abstract void click();
	void sendKeys();
	void getText();
	
	default void getElement(){
		System.out.println("getElement method from interface");
	}
	
	static void getWebElements(){
		System.out.println("getWebElements method from interface");
	}

}
