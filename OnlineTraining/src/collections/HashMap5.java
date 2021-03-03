package collections;

import java.util.HashMap;

public class HashMap5 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm1=new HashMap<>();
		hm1.put("username", "testuser@gmail.com");
		hm1.put("password", "Test@123");
		
		HashMap<String,String> hm2=new HashMap<>(hm1);
		//hm2.putAll(hm1);
		hm2.put("login", "Login value");
		
		System.out.println(hm2);
		
	}

}
