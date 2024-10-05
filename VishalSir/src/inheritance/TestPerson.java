package inheritance;

import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        
        int choice;
        boolean exit= true;
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        while(exit) {
        	System.out.println("1.Register Student");
        	System.out.println("2.Register Teacher");
        	System.out.println("3.Show All Student");
        	System.out.println("4.Show All Teacher");
        }

        System.out.println("Enter number of Persons you want to add: ");
        size = sc.nextInt();
        sc.nextLine(); // Consume the newline

        Person[] p = new Person[size];

        // Student details
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Details for Student " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.print("Enter Address: ");
            String add = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            short rollNo = sc.nextShort();
            sc.nextLine(); // Consume the newline

            System.out.println("===============================");
            p[i] = new Student(name, age, add, rollNo); // Using rollNo instead of age
        }

        // Display stored persons
        System.out.println("\nStored Persons:");
        for (Person person : p) {
            System.out.println(person);
        }

        sc.close(); // Close the scanner
    }
}
