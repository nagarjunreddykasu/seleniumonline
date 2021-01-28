package basics;

public class ForDemo6 {
	public static void main(String[] args) {
		int number=50, num1=0,num2=1,num3=0;
		System.out.print(num1+"\t"+num2); // 0	1
		//for(;num3<=number;){
		while(num3<=number){
			num3=num1+num2;
			if(num3<=number){
				System.out.print("\t"+num3); // 0	1	1	2
				num1=num2;
				num2=num3;
			}
		}
	
		
	}

}


// 0 1 1 2 3 5 8 13 21 34 

