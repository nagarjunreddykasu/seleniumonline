package stringmanipulations;

public class StringBufferDemo {
public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Selenium ");
		sb.append("Training");
		System.out.println(sb);
		
		//insert() //Selenium Training
		
		/*sb.insert(2, "WebDriver");
		System.out.println(sb);*/
		
		//replace()  //Selenium Training
		
		/*sb.replace(1, 5, "Test"); //STestlenium Training //STestium Training
		System.out.println(sb);*/
		
		//delete() //Selenium Training
		
		/*sb.delete(1, 5);
		System.out.println(sb);*/
		
		//reverse()
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
