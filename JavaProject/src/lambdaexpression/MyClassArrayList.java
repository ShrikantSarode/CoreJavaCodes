package lambdaexpression;

import java.util.ArrayList;

public class MyClassArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(23);
        arrayList.add(34);
        arrayList.add(45);
        arrayList.add(56);
        
        // 1st use of lambda expression: display all numbers
        arrayList.forEach(n -> System.out.println(n));
        System.out.println("===============================");
        
        // 2nd use of lambda expression: display the even numbers
        arrayList.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
