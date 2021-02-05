package polymorphism;

public class Overload4 {
	
	public void getAmount(double d){
		System.out.println("method with double type");
	}
	
	public void getAmount(float f){
		System.out.println("method with float type");
	}
	public void getAmount(short s){
		System.out.println("method with short type");
	}
	
	public static void main(String[] args) {
		Overload4 obj=new Overload4();
		obj.getAmount(250);//float
		obj.getAmount(10.25);//double
		obj.getAmount((byte)10);//short
		obj.getAmount((short)25);//short
		obj.getAmount(800l);//float
		obj.getAmount(25.75f);//float
	}
	

}

// byte short char int long float double
