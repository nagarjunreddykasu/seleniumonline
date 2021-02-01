package basics;

public class MethodsDemo6 {
	//instance variables
	int a=10,b=20;
	
	void add(int a, int b){ //local variables
		System.out.println(a+b);//400
		System.out.println(this.a+this.b);//30
	}
	
	/*static void addition(int a, int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);  //Error: cannot use this in static context
	}*/
	
	
	public static void main(String[] args) {
		MethodsDemo6 obj=new MethodsDemo6();
		obj.add(150, 250);
		
	}

}

// 400	30

//400	400

//this keyword can be used to represent instance variables when instance and local variable names are same

//400 30