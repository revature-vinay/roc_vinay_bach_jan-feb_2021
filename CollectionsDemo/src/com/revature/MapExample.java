package com.revature;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		// HashMap is not thread-safe unlike HashTable
		// HashMap is faster because it is not thread-safe and doesn't need to do thread-checking
		// HashMap also allows one null key and any number of null values
		// HashTable does not allow any null keys or null values whatsoever
		
		// Map is not in anyway related to the Collection interface.. but it is part of the Collections API of Java
		Map<String, Long> phoneBook = new HashMap<>();
		
		phoneBook.put("Larry", 5032343L);
		phoneBook.put("Bob", 5032344L);
		phoneBook.put("Tom", 5031234L);
		
		// duplicate values are allowed
		phoneBook.put("Dad", 5031111L);
		phoneBook.put("Mom", 5031111L);
		
		// duplicate keys are NOT! So if I do this, it will overwrite the phonenumber value for Tom
		phoneBook.put("Tom", 5039875L);
		
		System.out.println(phoneBook);
		
		// HashMaps and HashTables do not preserve order. We are not guaranteed what order our elements will print out in
		// iterate over the keys
		// TreeMap does preserve order
		Set<String> phoneBookKeys = phoneBook.keySet();
		for (String e : phoneBookKeys) {
			System.out.println(e);
		}
		
		// we can also iterate over both keys and values
		Set<Map.Entry<String, Long>> keyValues = phoneBook.entrySet();
		for (Map.Entry<String, Long> entry : keyValues) {
			String key = entry.getKey();
			Long value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		// we can also iterate just over every value
		Collection<Long> values = phoneBook.values();
		for (Long l : values) {
			System.out.println(l);
		}
		
		// Look up Tom's phone number
		System.out.println("Tom's phone number: " + phoneBook.get("Tom"));
		
		// The main key for using different Objects as Keys for Maps
		// Would be to override the .hashCode() method from the Object class
		// We also want to override the .equals() method as well
	}

}
