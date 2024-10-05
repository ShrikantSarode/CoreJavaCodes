package assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareNumber {

	public static float checkSquare(float n) {

		return n * n;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		try {
			float n = sc.nextFloat();
			System.out.println(checkSquare(n));
		} catch (InputMismatchException e) {
			System.out.println("wrong ip");
		}
	}
}
