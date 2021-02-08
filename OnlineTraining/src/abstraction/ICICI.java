package abstraction;

public class ICICI extends Bank{

	
	double getRateOfInterest() {
		System.out.println("ICICI Rate of Interest");
		return 7.90;
	}
	
	public static void main(String[] args) {
		ICICI obj=new ICICI();
		double rate=obj.getRateOfInterest();
		System.out.println(rate);
		
		Bank bank=new ICICI();
		bank.getRateOfInterest();
		
		
		
	}

}
