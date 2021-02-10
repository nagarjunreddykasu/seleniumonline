package arrays;

public class ArraysDemo4 {
	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(101,"Srinivas");
		arr[1]=new Employee(102,"Ravi");
		arr[2]=new Employee(103,"Satish");
		//arr[3]=new Employee(104,"asdfgh");
		
		//Retreive the values of object array using for loop
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].empId+"\t"+arr[i].empName);
		}
		
		//Retrive the values of object array using for each loop
		for(Employee emp:arr){
			System.out.println(emp.empId+"\t"+emp.empName);
		}
		
		
	}
	
	

}


class Employee{
	public int empId;
	public String empName;
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
}