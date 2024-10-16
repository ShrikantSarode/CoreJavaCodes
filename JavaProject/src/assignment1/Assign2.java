package assignment1;

import java.util.Scanner;

//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.

public class Assign2 {

	private int rollNo, s1, s2, s3;
	private String name;
	private float avg = 0f, tot = 0f;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No, Name, Sub1_Marks,Sub2_Marks,Sub3_Marks: ");
		rollNo = sc.nextInt();
		name = sc.next();
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();

	}

	public void display() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Subject 1: " + s1);
		System.out.println("Subject 2: " + s2);
		System.out.println("Subject 3: " + s3);
		System.out.println("================================");

	}

	public void checkResult() {
		tot = s1 + s2 + s3;
		avg = tot / 3;
		System.out.println("Average is " + avg);
		if (avg > 40) {
			System.out.println("You are Eligible");
		} else {
			System.out.println("You are not Eligible");
		}

	}

	public static void main(String[] args) {
		Assign2 a1 = new Assign2();
		a1.accept();
		a1.display();
		a1.checkResult();
	}
}
