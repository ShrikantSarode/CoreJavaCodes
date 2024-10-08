package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetDemo1 {

	public static void main(String[] args) {

		// collection of Integers array
		TreeSet<Integer> tree1 = new TreeSet<Integer>();// it gives sorted
		tree1.add(60);
		tree1.add(50);
		tree1.add(10);
		tree1.add(30);
		tree1.add(20);
		tree1.add(40);

		System.out.println("Size is " + tree1.size());

		Iterator itr = tree1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Using SOP");
		System.out.println(tree1);

		// to remove
		tree1.remove(20);
		System.out.println(tree1);
		
		System.out.println("First: "+tree1.first());
		System.out.println("Last: "+tree1.last());
		System.out.println("isEmpty: "+tree1.isEmpty());

	}
}
