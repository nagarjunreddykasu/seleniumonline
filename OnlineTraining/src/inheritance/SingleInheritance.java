package inheritance;

// Single Inheritance
public class SingleInheritance extends SingleParent{
	
	void method3(){
		System.out.println("method3 from child class");
	}
	
	void method4(){
		System.out.println("method4 from child class");
	}
	
	public static void main(String[] args) {
		SingleInheritance obj=new SingleInheritance();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
		System.out.println(obj.a+"\t"+obj.b);
		
		
		SingleParent p=new SingleInheritance();
		p.method1();
		p.method2();
		System.out.println(p.a+"\t"+p.b);
		
		SingleParent p2=new SingleParent();
		p2.method1();
		p2.method2();
		System.out.println(p2.a+"\t"+p2.b);
		
		//SingleInheritance child=new SingleParent(); //cannot convert from parent to child
		
		
	}

}
