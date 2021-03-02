package collections;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Element5");
		ts.add("Element1");
		ts.add("Element4");
		ts.add("Element2");
		ts.add("Element3");
		
		TreeSet<String> ts2=new TreeSet<>();
		ts2.addAll(ts);
		ts2.add("Vendor");
		ts2.add("Selenium");
		
		System.out.println(ts2.first());
		System.out.println(ts2.last());
		System.out.println(ts2.lower("Element3"));
		System.out.println(ts2.higher("Element3"));
		System.out.println(ts2.headSet("Element4"));
		System.out.println(ts2.tailSet("Element4"));
		
		System.out.println(ts2.pollFirst());
		System.out.println(ts2);
		System.out.println(ts2.pollLast());
		System.out.println(ts2);
		
		System.out.println(ts2.size());
		
		//System.out.println(ts2.add(null));
	}

}


/*
Methods in TreeSet class:
1. add(Object o): Adds the specified element to this set if it is not already present.
2.  addAll(Collection c):Adds all of the elements in the specified collection to this set.
3. clear(): Removes all of the elements from this set.
4. contains(Object o): Returns true if this set contains the specified element.
5. first(): Returns the first (lowest) element currently in this sorted set.
6. last(): Returns the last (highest) element currently in this sorted set.
7. lower(E): it prints lower object of specified object
8. higher(E): it prints higher object of specified object
9. headSet(Object toElement): Returns a view of the portion of this set whose elements are strictly less than toElement.
10. subSet(Object fromElement, Object toElement): Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
11. tailSet(Object fromElement): Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
12. remove(Object o): Removes the specified element from this set if it is present.
13. pollFirst(): Returns the first element and remove it.
14. pollLast(): Returns the last element and remove it.
15. size(): Returns the number of elements in this set.





*/