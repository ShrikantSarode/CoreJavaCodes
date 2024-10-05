package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Person> persons = new ArrayList<>();
		boolean exit = true;

		while (exit) {
			System.out.println("1. Register Student");
			System.out.println("2. Register Teacher");
			System.out.println("3. Show All Students");
			System.out.println("4. Show All Teachers");
			System.out.println("5. Get All Details");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume the newline

			switch (choice) {
			case 1: // Register Student
				System.out.println("===============================");
				System.out.println("Student Registration.");
				System.out.println("===============================");
				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine(); // Consume the newline

				System.out.print("Enter Address: ");
				String address = sc.nextLine();

				System.out.print("Enter Roll Number: ");
				short rollNo = sc.nextShort();
				sc.nextLine(); // Consume the newline

				persons.add(new Student(name, age, address, rollNo));
				System.out.println("Student registered successfully.");
				System.out.println("===============================");
				break;

			case 2: // Register Teacher
				System.out.println("===============================");
				System.out.println("Teacher Registration.");
				System.out.println("===============================");
				System.out.print("Enter Name: ");
				name = sc.nextLine();

				System.out.print("Enter Age: ");
				age = sc.nextInt();
				sc.nextLine(); // Consume the newline

				System.out.print("Enter Address: ");
				address = sc.nextLine();

				System.out.print("Enter Salary: ");
				double salary = sc.nextDouble();
				sc.nextLine(); // Consume the newline

				persons.add(new Teacher(name, age, address, salary));
				System.out.println("Teacher registered successfully.");
				System.out.println("===============================");
				break;

			case 3: // Show All Students
				System.out.println("\nStored Students:");
				for (Person person : persons) {
					if (person instanceof Student)
						System.out.println(person);

				}
				break;

			case 4: // Show All Teachers
				System.out.println("\nStored Teachers:");
				for (Person person : persons) {
					if (person instanceof Teacher)
						System.out.println(person);

				}
				break;
			case 5: // Show All 
				System.out.println("\nStored Teachers And Students:");
				for (Person person : persons) {
					
						System.out.println(person);

				}
				break;

			case 6: // Exit
				exit = false;
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

		sc.close();
	}
}
