package exception;

import java.util.Scanner;

public class CheckPassword extends Exception {

	public CheckPassword(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Password: ");
	String pass=sc.next();
	
	try {
		if(pass.length()<8)
		{
			throw new CheckPassword("Password length should be greater than zero");
		}else if(pass.matches("[A-Za-z0-9]*")) {
			throw new CheckPassword("Password should have special characters");
		}else {
			System.out.println("valid Password. :)");
		}
	}
	catch(Exception e) 
	{
		System.out.println(e.getMessage());
	}
	}
}
