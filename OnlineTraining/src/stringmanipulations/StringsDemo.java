package stringmanipulations;

public class StringsDemo {

	public static void main(String[] args) {
		String first="Selenium Training ";
		String second="WebDriver";
		
		System.out.println(first);//Selenium
		System.out.println(second);//WebDriver
		
		String newFirst=first.concat("Training");
		System.out.println(first);//Selenium
		System.out.println(newFirst);//Selenium Training
		
		//length()
		System.out.println("Length of first: "+first.length());
		
		System.out.println(first+second);
		int a=100,b=200;
		System.out.println(a+b);//300
		System.out.println(a+first);//100selenium
		
		//Compare two Strings
		String actualMsg="Please enter valid username";
		String expectedMsg="Please enter valid username";
		
		boolean result=actualMsg.equals(expectedMsg);
		System.out.println(result);
		
		//charAt(index i)
		System.out.println(first.charAt(4));
		
		//indexOf()
		System.out.println(first.indexOf('n'));
		
		String course="Java Programming";
		System.out.println(course.indexOf('a',4));//1  -1
		
		
		//trim()
		String tr="   Selenim Training    ";
		System.out.println(tr);
		System.out.println(tr.trim());
		
		//split()
		String months="Jan,Feb,Mar,Apr,May,Jun";
		String[] arr=months.split(",");
		
		System.out.println("First Month: "+arr[0]);
		
		for(String month:arr){
			System.out.println(month);
		}
		
		System.out.println("Last index value: "+arr[arr.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


/*
String: Immutable (not changeable)
String refvariable="userjlkfjsd";

String obj=new String("testuser");




*/
