package exceptionhandling;

public class ExceptionHandlingDemo3 {
	public static void main(String[] args) {
		try{
			System.out.println("Execution started...");
			System.out.println(10/0);
			System.out.println("Execution completed");
			
		}
		catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException ae){
			System.out.println("ArithmeticException Catch block is exucuted");
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
