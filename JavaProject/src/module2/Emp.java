package module2;

import java.util.Scanner;

public class Emp {

	private int empNo;
	private String eName;
	private double sal;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Emp No: ");
		empNo = sc.nextInt();

		System.out.println("Enter Emp Name: ");
		eName = sc.next();

		System.out.println("Enter Emp Salary: ");
		sal = sc.nextDouble();
	}

	public void display() {
		System.out.println("Enter Emp No: " + empNo);
		System.out.println("Enter Emp Name: " + eName);
		System.out.println("Enter Emp Salary: " + sal);

	}

	public void completeProject() {
		System.out.println("completeProject");

	}

	public void checkAttendance() {
		System.out.println("Check Attendance");

	}

	public void applyLoan() {
		System.out.println("applyLoan");

	}
}
