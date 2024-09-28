package icicibank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);

		

		do {

			System.out.println("Welcome to ICICI Bank!!");
			System.out.println("1.Accept Details");
			System.out.println("2.Display Details");
			System.out.println("3.Withdraw Details");
			System.out.println("4.Deposit Amount");
			System.out.println("5.Transfer Amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update Balance");
			System.out.println("8.Exit");
			
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch (ch) {		
			
			case 1:
				System.out.println("1.Accept Details");
				break;

			case 2:
				System.out.println("2.Display Details");
				break;

			case 3:
				System.out.println("3.Withdraw Details");
				break;

			case 4:
				System.out.println("4.Deposit Amount");
				break;

			case 5:
				System.out.println("5.Transfer Amount");
				break;

			case 6:
				System.out.println("6.Check Balance");
				break;

			case 7:
				System.out.println("7.Update Balance");
				break;

			case 8:
				System.out.println("Closed");
				System.exit(0);
			}
			

			

			System.out.println("Do you want to continue: {Y/N}");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("Thank you for using this App.");

		
	}

}
