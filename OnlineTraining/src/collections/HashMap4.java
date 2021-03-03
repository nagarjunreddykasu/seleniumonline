package collections;

import java.util.HashMap;

public class HashMap4 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("username", "testuser@gmail.com");
		hm.put("password", "Test@123");
		hm.putIfAbsent("login", "Login Button");
		
		
		System.out.println(hm.remove("username1"));
		
		hm.replace("username", "nagarjun@gmail.com");
		
		System.out.println(hm.containsKey("username11"));//true false
		
		System.out.println(hm.containsValue("Test@12324")); //true false
		
		System.out.println(hm.size());
		
		System.out.println(hm);
	}

}
