package module3;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice..: ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Movie Time.");
			break;

		case 2:
			System.out.println("Sleepy Sunday.");
			break;

		case 3:
			System.out.println("Saturday Night.");
			break;
			
		default:
			System.out.println("Let us complete.");
		}
	}
}
