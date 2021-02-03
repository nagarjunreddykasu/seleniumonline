package basics;

public class Constructor3 {
	
	Constructor3(){
		System.out.println("0-arg constructor");
	}
	
	Constructor3(int i){
		this(); //calling 0-arg constructor
		System.out.println("1-arg int constructor");
	}
	
	public static void main(String[] args) {
		new Constructor3(100);
	}
	
	
	

}
