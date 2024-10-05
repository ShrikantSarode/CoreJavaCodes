package assignment7;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Array Elemet: ");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the key: ");
			int key=sc.nextInt();
			
			System.out.println(arr[key]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Key is not range");
		}

	}
}
