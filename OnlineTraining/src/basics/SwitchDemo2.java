package basics;

public class SwitchDemo2 {
	public static void main(String[] args) {
		int a=12,b=3,result = 0;
		char operator='*';
		switch(operator){
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		case '%':
			result=a%b;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println(a+" "+operator+" "+b +" = "+result);
	}

}
