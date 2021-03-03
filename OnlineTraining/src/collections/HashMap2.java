package collections;

import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		
		System.out.println(hm.putIfAbsent("login", "Login Button"));
		
		System.out.println(hm.putIfAbsent("login", "Sign In"));
		
		System.out.println(hm);
		
	}

}
