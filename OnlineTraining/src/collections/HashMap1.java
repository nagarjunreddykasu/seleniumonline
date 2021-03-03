package collections;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		//ArrayList<String> al=new ArrayList<>();
		
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		
		System.out.println(hm.put("password", "ABCD"));
		
		System.out.println(hm.put("login", "Login Button"));
		
		System.out.println(hm);
		
		
		
	}

}
