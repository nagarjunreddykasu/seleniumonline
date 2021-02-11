package stringmanipulations;

public class StringConversion {
	public static void main(String[] args) {
		String str="200";
		
		int i=Integer.parseInt(str);
		System.out.println(i);
		int b=100;
		System.out.println(i+b);//300
		
		
		int age=35;
		String s=String.valueOf(age);
		System.out.println(s);
		System.out.println(s+b); //35100
		
		String s2=Integer.toString(age);
		System.out.println(s2+b);//35100
		
		
	}

}
