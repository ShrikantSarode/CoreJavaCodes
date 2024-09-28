package module4;

import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private double sal;
	
	Scanner sc= new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter name, age, sal: ");
		name=sc.next();
		age=sc.nextInt();
		sal=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
	}
	public void checkAge()
	{
		if(age>=18 && age<=100)
		{
			System.out.println("You are Eligible.");
		}
		else {
			System.out.println("You are not Eligible.");
		}
	}
	public void checkSalary()
	{
		if(sal>0 && sal<=100000)
		{
			System.out.println("Valid Salary.");
		}
		else {
			System.out.println("Invalid Salary.");
		}
	}
	
}
