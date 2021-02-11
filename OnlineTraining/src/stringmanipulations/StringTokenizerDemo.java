package stringmanipulations;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Selenium with Java Training");
		
		//System.out.println("First Token: "+st.nextToken());
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
		
	}

}
