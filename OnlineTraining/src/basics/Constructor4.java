package basics;

public class Constructor4 {
	Constructor4(){
		this(25);
		System.out.println("0-arg constructor");
	}
	
	Constructor4(int i){
		this("Nag");
		System.out.println("1-arg int constructor "+i);
	}
	
	Constructor4(String i){
		System.out.println("1-arg String constructor "+i);
	}
	
	public static void main(String[] args) {
		new Constructor4();
	}

}


//NOTE: 1. Constructor call must be the first statement.