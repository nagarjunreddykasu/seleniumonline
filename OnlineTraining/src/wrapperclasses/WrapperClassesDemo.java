package wrapperclasses;

public class WrapperClassesDemo {
	public static void main(String[] args) {
		
		
		byte b=10;
		short s=20;
		char ch='K';
		int i=35;
		long l=800;
		float f=10.75f;
		double d=200.50;
		boolean bool=true;
		
		//int in=null;
		Integer inte=null;
		
		//Autoboxing (Convert primitive types into corresponding wrapper class objects)
		Byte byteObj=b;
		Short shortObj=s;
		Character charObj=ch;
		Integer intObj=i;
		Long longObj=l;
		Float floatObj=f;
		Double doubleObj=d;
		Boolean boolObj=bool;
		
		
		//Unboxing
		byte byteValue=byteObj;
		short shortValue=shortObj;
		
		
		
		
		
		
		
	}
	

}



/*
Wrapper Class:
Wrapper classes are used to convert primitive data types into corresponding objects.

Primitive			Wrapper class
----------			--------------
byte				Byte
short 				Short
char				Character
int					Integer
long				Long
float				Float
double				Double
boolean				Boolean



*/