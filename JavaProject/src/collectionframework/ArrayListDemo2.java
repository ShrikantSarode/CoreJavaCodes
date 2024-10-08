package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList<>();
        
        arrayList.add(10);
        arrayList.add(10.55);
        arrayList.add(true);
        arrayList.add("Shrikant");
        arrayList.add("Sudarshan");
        
        
        Employee emp1 = new Employee(1,"Shrikant",1500000);
    	Employee emp2 = new Employee(2,"Ajay",150000);
        
        arrayList.add(emp1);
        arrayList.add(emp2);
        
        arrayList.addFirst(22);
        arrayList.addLast(23);
        arrayList.indexOf("Shrikant");
        arrayList.lastIndexOf("Sudarshan");
        
        
       
        
        // 1st method: Using for loop
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        System.out.println("==============================");
        // 2nd method: Using Iterator
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) //true
        {
            System.out.println(itr.next());
        }
        System.out.println("==========================");
        
        boolean res= arrayList.contains(10);
        System.out.println(res);
        
        boolean res1=arrayList.remove("sudarshan");
        System.out.println(res1);
        
         arrayList.clear();
        
        boolean res3=arrayList.isEmpty();
        System.out.println(res3);
        
      
        
        
    }
}
