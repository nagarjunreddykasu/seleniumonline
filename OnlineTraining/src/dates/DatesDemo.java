package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesDemo {

	public static void main(String[] args) {

		Date date=new Date();
		System.out.println(date);

		//To convert date in MM-dd-yyyy format
		SimpleDateFormat mdy=new SimpleDateFormat("MM-dd-yyyy");
		String mmddyy=mdy.format(date);
		System.out.println(mmddyy);

		//To convert date in dd-MM-yyyy format
		SimpleDateFormat dmy=new SimpleDateFormat("dd-MM-yyyy");
		String ddmmyy=dmy.format(date);
		System.out.println(ddmmyy);

		//To convert date in yyyy-MM-dd format
		SimpleDateFormat ymd=new SimpleDateFormat("yyyy-MM-dd");
		String yymmdd=ymd.format(date);
		System.out.println(yymmdd);
		
	

	}

}
