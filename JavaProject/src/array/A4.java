package array;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		int size;
		int count = 0;
		int n = 6;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter Array of " + size + " : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		System.out.println("Count: " + count);

	}
}
