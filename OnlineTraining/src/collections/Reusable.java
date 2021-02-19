package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Reusable {
	public static ArrayList<String> compareArrayLists(ArrayList<String> expected,ArrayList<String> actual){
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
		
	}
}


// driver.findElement(By.id("submit")).click();