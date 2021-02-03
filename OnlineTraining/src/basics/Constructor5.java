package basics;
//widening type casting
public class Constructor5 {
	
	Constructor5(double l){
		System.out.println("Double value: "+l);
	}
	
	Constructor5(float f){
		System.out.println("Float value: "+f);
	}
	
	Constructor5(int i){
		System.out.println("Int value: "+i);
	}
	
	public static void main(String[] args) {
		new Constructor5(250.75f);
		new Constructor5((byte)15);
	}
	

}

// byte->short->char->int->long->float->double  (Widening/implicit)