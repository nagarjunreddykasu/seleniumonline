package dates;

import java.time.LocalDate;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();//2021-02-12
		LocalDate date2=LocalDate.parse("2021-02-15");
		
		int result=date1.compareTo(date2);//it returns 0 if both dates are equal, returns positive if date1 is greater than date2, returns negative if date1 is smaller than date2
		System.out.println(result);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.isEqual(date2));
		
		
		System.out.println(date1.getDayOfMonth());//12
		System.out.println(date1.getDayOfWeek());//FRIDAY
		System.out.println(date1.getDayOfYear());//43
		System.out.println(date1.getMonth());//FEBRUARY
		System.out.println(date1.getMonthValue());//2
		
		
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.lengthOfMonth());//28
		System.out.println(date1.lengthOfYear());//365
		System.out.println(date1.isLeapYear());
		
		
		System.out.println(date1.plusDays(3));//2021-02-15
		System.out.println(date1.plusWeeks(1));//2021-02-19
		System.out.println(date1.plusMonths(1));//2021-03-12
		System.out.println(date1.plusYears(1));//2022-02-12
		
		
		System.out.println(date1.minusDays(3));//
		System.out.println(date1.minusWeeks(1));//
		System.out.println(date1.minusMonths(1));//
		System.out.println(date1.minusYears(1));
	
		
		

	
		
		
		
		
	}

}
