package basics;

public class ForDemo1 {
	public void numbers(){
		for(int count=1;count<=10;count++){
			System.out.println(count);  //1 2 3
		}
		
		System.out.println("After for loop");
	}
	
	public void even(){
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		ForDemo1 obj=new ForDemo1();
		obj.numbers();
		
		obj.even();
		
		
		
	}

}


/*

for(initialization;condition;increment/decrement){
}


*/