package basics;

public class ControlFlow {
	public static void main(String[] args) {
		int a=5,b=20,c=100;
		/*if(a<b){
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("else block");
		}
		
		int age=15;
		if(age>=18){
			System.out.println("Person is eligible for vote");
		}
		else{
			System.out.println("Person is NOT eligible for vote");
		}*/
		
		if(a>b){
			if(a>c){
				System.out.println("a is larger value");
			}
			else{
				System.out.println("c is larger value");
			}
		}
		else{
			if(b>c){
				System.out.println("b is larger value");
			}
			else{
				System.out.println("c is larger value");
			}
		}
		
	}
	
}


//Decision making statements: if, if else, nested if, switch
//Looping statements: while, do while, for
//branching statements: break, continue, return

















