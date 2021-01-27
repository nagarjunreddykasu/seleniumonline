package basics;

//To swap two values
public class ForDemo5 {
	public static void main(String[] args) {
		/*int a=10,b=20,temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);*/
		
		int number=50,num1=0,num2=1,num3=0;
		System.out.print(num1+"\t"+num2);
		for(int i=2;i<=number;i++){
			num3=num1+num2; //1
			if(num2<=number){
				System.out.print("\t"+num3);  //0 1 1 2 3
				num1=num2; //1 
				num2=num3; //2
			}
			else{
				break;
			}

		}
		
		
		
		
	}

}

//0 1 1 2 3 5 8 13 21 34 55