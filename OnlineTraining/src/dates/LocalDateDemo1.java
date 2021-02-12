package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo1 {
	public static void main(String[] args) {
		
		LocalDate local=LocalDate.of(2021, 2, 20);
		System.out.println(local);//2021-02-20
		
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);//2021-02-12
		
		String str=ld.toString();
		System.out.println(str);//2021-02-12
		
		LocalDate ld2=LocalDate.parse(str);
		System.out.println(ld2);//2021-02-12
		
		System.out.println("After Converting into MM-dd-yyyy format: "+DateTimeFormatter.ofPattern("MM-dd-yyyy").format(ld2));
		System.out.println("After Converting into dd-MM-yyyy format: "+DateTimeFormatter.ofPattern("dd-MM-yyyy").format(ld2));
		System.out.println("After Converting into yyyy-MM-dd format: "+DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ld2));
		
		String str2="01/30/2021";//2021-01-30
		//Converting string date in MM/dd/yyyy format into LocalDate format yyyy-MM-dd
		System.out.println("Converting string date in MM/dd/yyyy format into LocalDate format yyyy-MM-dd "+LocalDate.parse(str2, DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		
		String str3="25/01/2021"; //2021-01-25
		System.out.println("Converting string date in dd/MM/yyyy format into LocalDate format yyyy-MM-dd "+LocalDate.parse(str3, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}

}
