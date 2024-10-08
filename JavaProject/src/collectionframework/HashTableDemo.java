package collectionframework;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable <Integer, String> table1 = new Hashtable<Integer, String>();
		//duplicate key not allowed
		table1.put(1, "Shrikant");
		table1.put(2, "Ajay");
		table1.put(3, "Dhanya");
		table1.put(4, "Suresh");
		table1.put(5, "Mahesh");
		table1.put(6, "Shree Ram");
		
		System.out.println(table1);
		
		System.out.println(table1.get(1));//key is 1 will return the value of key
		
		//clear,toString,remove(),isEmpty,contains,size()
	}
}
