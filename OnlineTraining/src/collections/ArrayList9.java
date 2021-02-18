package collections;

import java.util.ArrayList;

public class ArrayList9 {
	
	public static void main(String[] args) {
		Vendor v1=new Vendor(101,"Vendor1");
		Vendor v2=new Vendor(102,"Vendor2");
		Vendor v3=new Vendor(103,"Vendor3");
		Vendor v4=new Vendor(104,"Vendor4");
		
		
		ArrayList<Vendor> al=new ArrayList<>();
		al.add(v1);
		al.add(v2);
		al.add(v3);
		al.add(v4);
		
		ArrayList<Vendor> al2=new ArrayList<>();
		al2.addAll(al);
		al2.add(v3);
		al2.add(v4);
		
		//System.out.println(al2);
		
		System.out.println(al2.contains(v1));//true
		
		System.out.println(al2.containsAll(al));//true
		
		System.out.println(al2.size());
		
		System.out.println(al2.remove(v1));//true
		
		System.out.println(al2.contains(v1));//false
		
		System.out.println(al2.containsAll(al));//false
		
		//To retreive the data from al2
		for(Vendor v:al2){
			System.out.println(v.vendorID+"\t"+v.vendorName);
		}
		
		
		
	}

}

class Vendor{
	int vendorID;
	String vendorName;
	Vendor(int vendorID,String vendorName){
		this.vendorID=vendorID;
		this.vendorName=vendorName;
	}
}
