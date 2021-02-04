package inheritance;

public class Hierarchical {
	public static void main(String[] args) {
		HierarchicalChild1 obj1=new HierarchicalChild1();
		obj1.method1();
		obj1.method3();
		
		HierarchicalChild2 obj2=new HierarchicalChild2();
		obj2.method2();
		obj2.method3();
		
	}

}