package polymorphism;

public class Overridden1 {
	//overridden
	public void login(){
		System.out.println("parent class login method");
	}
	
	protected void click(){
		System.out.println("parent class click method");
	}
	void getText(){
		System.out.println("Parent class getText method");
	}

}


/*
Rules for Method Overriding:

1. Overridden method signature and Overriding method signature must be same
2. Return types of overridden method and overriding method must be same
3. Both overridden and overriding methods should be instance methods (non-static)
4. The access level can not be more restrictive than Overridden method's access level.
We can not reduce the scope but increase the scope
public private protected default

parentmethod 		childmethod
public				public
protected			protected/public
default				default/protected/public
private --> overriding concept is not applicable for private members


*/

// public > protected > default > private

