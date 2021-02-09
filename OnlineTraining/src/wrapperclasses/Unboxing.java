package wrapperclasses;

public class Unboxing {
	public static void main(String[] args) {
		Integer intObj=new Integer(3);//Integer wrapper class object
		
		int i=intObj.intValue();//converting Integer to int explicitly
		
		int j = intObj; //Unboxing
		
		System.out.println(intObj+"\t"+i+"\t"+j);
	}

}
