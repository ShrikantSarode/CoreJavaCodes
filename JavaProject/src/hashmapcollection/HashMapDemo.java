package hashmapcollection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//unsorted and only 1 null is allowed
		//multiple null values are allowed
		HashMap<Character, String> hashMap = new HashMap<Character, String>();
		hashMap.put('S', "Shrikant");
		hashMap.put('A', "Ashvini");
		hashMap.put('K', "Kiran");
		hashMap.put('F', "Fatima");
		hashMap.put('J', "John");
		hashMap.put('L', "Lalit");
		hashMap.put(null, "Mintu");
		hashMap.put(null, "Chintu");
		
		System.out.println(hashMap);
		
		boolean res=hashMap.containsKey('K');
		System.out.println("K Contains: "+res);
		
		hashMap.remove('J');
		hashMap.replace('F',"Farani");
		System.out.println(hashMap);
		
		System.out.println("==================================");
		System.out.println("Display Keys..");
		
		Object[] keys = hashMap.keySet().toArray();
		System.out.println("\nkeys: ");
		
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i]);
			
		}
		System.out.println("============================================");
		System.out.println("To print values: ");
		for (int i = 0; i < keys.length; i++) {
			
			System.out.println(hashMap.get(keys[i]));
		}
		System.out.println("====================================");
		System.out.println(hashMap.get('K'));
		
	}
}
