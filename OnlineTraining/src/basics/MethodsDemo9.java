package basics;

public class MethodsDemo9 {
	
	String username="Test User";
	
	String login(String username){
		
		return this.username;
		
	}
	
	public static void main(String[] args) {
		MethodsDemo9 obj=new MethodsDemo9();
		String user=obj.login("Nagarjun");
		System.out.println("User Name: "+user);
		
		
		
	}

}

//https://github.com/nagarjunreddykasu/seleniumonline/tree/master/OnlineTraining/src/basics