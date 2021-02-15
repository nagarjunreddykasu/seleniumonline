package exceptionhandling;

public class ExceptionHandlingDemo1 {
	
	public static void main(String[] args) {
		try{
			System.out.println("Execution started...");
			System.out.println(10/0);
			System.out.println("Execution completed");
		}
		catch(ArithmeticException ae){
			System.out.println("Catch block is exucuted");
		}
	}
	
	
	/*public void TC_Search_01(){
		try{
			
		}
		catch(Exception e){
			
		}
	}*/
	
	

}


/*
					Throwable
				
				Exception   Error
				
				
Exception:
	IOException
	SQLException
	ClassNotFoundException
	RuntimeException
		ArithmeticException
		NullPointerException
		NumberFormatException
		IndexOutofBoundsException
		'	ArrayIndexOutOfBoundsException
			StringIndexOutOfBoundException
	
				

Error
	StackOverflowError
	VirtualMachineError
	OutofMemoryError
				

		
Checked Exceptions /Compile time exceptions:
Exceptions which are checked by the compiler at the time of compilation


Unchecked Exceptions/Run time exceptions:
Exceptions which are not checked by the compiler at the time of compilation are called unchecked exceptions.
				



*/