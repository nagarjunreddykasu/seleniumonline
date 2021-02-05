package polymorphism;

//Different Data type of parameters
public class Overload2 {
	public void getAmount(int a){
		System.out.println("int parameter");
	}
	public void getAmount(float f){
		System.out.println("float parameter");
	}
	public void getAmount(double d){
		System.out.println("double parameter");
	}
	
	public static void main(String[] args) {
		Overload2 obj=new Overload2();
		obj.getAmount(1000);
		obj.getAmount(10.25f);
		obj.getAmount(25.50);
	}
	

}
