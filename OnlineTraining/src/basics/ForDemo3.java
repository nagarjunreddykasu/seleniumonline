package basics;

//To find the largest value among the 3 numbers using if else
public class ForDemo3 {
	public static void main(String[] args) {
		int a=100,b=100,c=100;
		
		if(a>b && a>c){
			System.out.println(a+" is largest value");			
		}
		else if(b>a && b>c){
			System.out.println(b+" is largest value");
		}
		else if(c>a && c>b){
			System.out.println(c+" is largest value");
		}
		else{
			System.out.println("All the values are equal");
		}

	}

}


/*
Assignment-3:
1. Write a program to check whether the given alphabet is vowel or consonant using if else.
2. Write a program to find the factorial of given number.
3. Write a program to display the fibonacci series until 100.
4. Write a program to print reverse number of given number using while and for loops.
5. Write a program to check whether the given number is prime number or not using while and for loops.
6. 

*/