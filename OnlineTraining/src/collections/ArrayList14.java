package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList14 {
	
	
	/*public static ArrayList<String> compareArrayLists(ArrayList<String> expected,ArrayList<String> actual){
		Iterator<String> itr=expected.iterator();
		while(itr.hasNext()){
			String value=itr.next();
			if(actual.remove(value)){
				itr.remove();
			}
		}
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(expected);
		unmatched.addAll(actual);
		return unmatched;
		
	}*/
	
	
	
	public static void main(String[] args) throws Exception {
		
		String expectedOptions="India,England,China,Australia,Bangladesh,United States";
		String[] arr=expectedOptions.split(",");
		ArrayList<String> expected=new ArrayList<>(Arrays.asList(arr));
		System.out.println(expected);
		
		ArrayList<String> actual=new ArrayList<>();
		actual.add("India");
		actual.add("England dshfjk");
		actual.add("China");
		actual.add("Australia");
		actual.add("Bangladesh");
		actual.add("United States");
		
		/*Iterator<String> itr=expected.iterator();
		while(itr.hasNext()){
			String value=itr.next();
			if(actual.remove(value)){
				itr.remove();
			}
		}
		
		
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(expected);
		unmatched.addAll(actual);*/
		
		//System.out.println("Unmatched Options: "+unmatched);
		
		ArrayList<String> unmatched=Reusable.compareArrayLists(expected,actual);
		
		if(unmatched.size()==0){
			System.out.println("Both Expected and Actual Options are Equal.");
		}
		else{
			System.out.println("Both Expected and Actual Options are NOT Equal.");
			throw new Exception("Both Expected and Actual Options are NOT Equal. Unmatched Options: "+unmatched);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
