package basics;

public class TypeCastingDemo {
	public static void main(String[] args) {
		
		//Widening type casting
		byte b=15;
		int i=b; //15
		
		float f=i;
		
		char ch='A'; //ascii value of 'A' is 65
		int in=ch;
		
		System.out.println("int value: "+i);
		System.out.println("float value: "+f);
		System.out.println("Char value: "+in);
		
		//Narrowing type casting
		double d=15.75;
		long l=(long)d; //converting double to long data type
		
		System.out.println("Long value: "+l);
		
		
		
	}

}


//1. Widening Type casting (Implicit type casting)
	//converting lower data type into higher data type

//byte->short->char->int->long->float->double

//'n' true


//2. Narrowing Type casting (explicit type casting)
		//converting higher data type into lower data type

//double->float->long->int->char->short->byte