package assignment1;

import java.util.Scanner;

public class Assign3 {

	private char id, access,admin;
	private String name;

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Do you Have Id Y or N: ");
		id = sc.next().charAt(0);

		System.out.println("Do you Have Access Card Y or N: ");
		access = sc.next().charAt(0);
		
		System.out.println("Are you Admin Y or N: ");
		admin = sc.next().charAt(0);

	}


	public void checkResult() {

		if (id == 'y' || id == 'Y' || access == 'y' || access == 'Y') {
			System.out.println(name+" you are Allowed");
		}else if(admin=='Y' || admin=='y')
		{
			System.out.println("Allowed");
		}
			else {
			System.out.println(name+" you are not Allowed");
		}
	}

	public static void main(String[] args) {
		Assign3 a1= new Assign3();
		a1.accept();
		a1.checkResult();
		
	}
}
