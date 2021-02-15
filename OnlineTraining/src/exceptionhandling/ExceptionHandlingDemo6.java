package exceptionhandling;

public class ExceptionHandlingDemo6 {
	//instance method
		void verify(int dbCount) throws InvalidCountException{
			int appCount=50;
			if(appCount==dbCount){
				System.out.println("Count of records from app and db are Equal.");
			}
			else{
				throw new InvalidCountException("Records are NOT equal..");
			}
			
		}
		
		
		public static void main(String[] args) throws Exception {
			//static area
			ExceptionHandlingDemo5 obj=new ExceptionHandlingDemo5();
			obj.verify(60);
			
			
			
		}

}
