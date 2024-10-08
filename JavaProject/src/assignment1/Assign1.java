package assignment1;
//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.

import java.util.Scanner;

public class Assign1 {
	
	private int age;
	private String name;
	private double income;
	

	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name, Age and Income: ");
		name=sc.next();
		age=sc.nextInt();
		income=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Income: "+income);
	}
	
	public void checkLoan()
	{
		if(age>=18 && age<=60 && income>25000)
		{
			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
	}
	
	public static void main(String[] args) {
	
		Assign1 a1=new Assign1();
		a1.accept();
		a1.display();
		a1.checkLoan();
		
	}

}
