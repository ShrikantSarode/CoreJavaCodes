package assignment1;

import java.util.Scanner;

public class Assign4 {
	private String name;
	private int age;
	private char citizen;

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Enter age: ");
		age = sc.nextInt();

		System.out.println("Are you Indian Y or N: ");
		citizen = sc.next().charAt(0);

	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Citizen: "+citizen);
		System.out.println("======================== ");
	}
	public void checkAge()
	{
		if(age>=18 && age<=100 && citizen=='y'|| citizen=='Y')
		{
			System.out.println("You are Eligible.");
		}
		else
		{
			System.out.println("You are not Eligible.");
		}
	}
	

	public static void main(String[] args) {
		
		Assign4 a1=new Assign4();
		a1.accept();
		a1.display();
		a1.checkAge();

	}
}
