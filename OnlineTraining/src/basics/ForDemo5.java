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
		
		System.out.println("Fibonacci series using for loop");
		int number=50,num1=0,num2=1,num3=0;
		System.out.print(num1+"\t"+num2);
		for(;num3<=number;){
			num3=num1+num2; //1
			if(num3<=number){
				System.out.print("\t"+num3);
				num1=num2;
				num2=num3;
			}
		}
		System.out.println();
		
		System.out.println("Fibonacci series using while loop");
		int n=50,n1=0,n2=1,n3=0;
		System.out.print(n1+"\t"+n2);
		while(n3<=n){
			n3=n1+n2;
			if(n3<=n){
				System.out.print("\t"+n3);
				n1=n2;
				n2=n3;
			}
		}
		
		
	}

}

//0 1 1 2 3 5 8 13 21 34