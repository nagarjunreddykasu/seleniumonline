package polymorphism;

public class SuperConstructors extends ConstructorsParent{
	
	SuperConstructors(){
		super("hyderabad");//calling parent class constructor without arg
		//this(10);
		System.out.println("Child class constructor");
	}
	
	SuperConstructors(int a){
		//super();
		System.out.println("Child class constructor with 1 int parameter");
	}
	
	
	public static void main(String[] args) {
		
		new SuperConstructors();
		new SuperConstructors(300);
		
		
	}

}
