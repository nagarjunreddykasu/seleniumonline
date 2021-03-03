package collections;

import java.util.HashMap;

public class HashMap3 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		hm.putIfAbsent("login", "Login Button");
		
		
		//get()
		
		System.out.println(hm.get("username"));
		
		System.out.println(hm.getOrDefault("password11", "Key Not Found"));
		
		
	}

}
