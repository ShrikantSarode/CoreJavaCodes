package module2;

import java.util.Scanner;

public class Student {
	 private int rollNo;
	 private String name;
	 private double score;
	 
	 Scanner sc=new Scanner(System.in);
	 
	 public void accept()
	 {
		 System.out.println("Enter Roll No: ");
		 rollNo=sc.nextInt();
		 
		 System.out.println("Enter Name: ");
		 name=sc.next();
		 
		 System.out.println("Enter Score: ");
		 score=sc.nextDouble();
	 }
	
	public void attend()
	{
		System.out.println("Attend the class.");
	}
	public void apperExam()
	{
		System.out.println("Appear for exam.");
	}
	public void completeAssignment()
	{
		System.out.println("Complete Assignment.");
	}
	public void display()
	{
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
}
