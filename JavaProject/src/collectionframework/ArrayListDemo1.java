package collectionframework;

import java.util.ArrayList;
import java.util.List;



public class ArrayListDemo1 {

	public static void main(String[] args) {
		
	Employee emp1 = new Employee(1,"Shrikant",1500000);
	Employee emp2 = new Employee(2,"Ajay",150000);
	Employee emp3 = new Employee(3,"Suresh",250000);
	Employee emp4 = new Employee(4,"Priti",55000);
	Employee emp5 = new Employee(5,"Geet",85000);
	Employee emp6 = new Employee(6,"Raju",950000);
		
//		ArrayList arrayList = new ArrayList();
//		List<E> list= new ArrayList<E>();
		ArrayList<Employee> arrayList = new ArrayList<Employee>();//it is unsorted and faster
		
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		arrayList.add(emp5);
		arrayList.add(emp6);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
}
