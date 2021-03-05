package collections;


public class MapDemo {
	public static void main(String[] args) {
		
	}
}


/*
The main objective of Map is to represent group of objects as key value pairs.

Each key and value pair is called as an Entry.

Duplicate Keys are NOT allowed in Map.

When we have to Search, Delete and update elements based on Key.

						Map(i)
		
HashMap(c)		ConcurrentHashMap(c)		SortedMap(i)					Hashtable(c)

LinkedHashMap(c)							NavigableMap(i)					Properties(c)

											TreeMap(c)

HashMap:
----------
HashMap contains values based on Key.
HashMap does not allow duplicate keys but allows duplicate values.
HashMap allows one null key and multiple null values.
Insertion order is NOT preserved.
Data structure is Hashtable.


LinkedHashMap:
--------------
HashMap contains values based on Key.
HashMap does not allow duplicate keys but allows duplicate values.
HashMap allows one null key and multiple null values.
Insertion order is preserved.
Data structures are Hashtable and LinkedList.


TreeMap():
---------
TreeMap contains values based on Key.
TreeMap does not allow duplicate keys but allows duplicate values.
TreeMap does not allow null key.
Insertion order is NOT preserved but it sorts the elements in ascending order based on key.
Data structure is Hashtable.

Hashtable:
------------
Hashtable contains values based on Key.
Hashtable does not allow duplicate keys but allows duplicate values.
Hashtable allows one null key and multiple null values.
Insertion order is NOT preserved.
Data structure is Hashtable.

 */

/*
Object put(Object key, Object value): It is used to insert an entry in this map.

String putIfAbsent(String key, String value): If the specified key is not already associated with a value (or is mappedto null)
 											  associates it with the given value and returns null, else returns the current value.

void putAll(Map map): It is used to insert the specified map in this map.

Object remove(Object key): It is used to delete an entry for the specified key.

Object get(Object key): It is used to return the value for the specified key.

String getOrDefault(Object key, String defaultValue): Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.

boolean containsKey(Object key): It is used to search the specified key from this map.

boolean containsValue(Object value): It is used to search the specified value from this map.

Collection values(): Returns a collection containing the values in the map. This method provides a collection-view of the values in the map.

Set keySet(): It is used to return the Set view containing all the keys.

Set entrySet(): It is used to return the Set view containing all the keys and values.

 */