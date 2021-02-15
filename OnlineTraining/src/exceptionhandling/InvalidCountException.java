package exceptionhandling;

public class InvalidCountException extends Exception{
	public static final long serialVersionID=1L;
	public InvalidCountException(String str){
		super(str);
	}
	

}
