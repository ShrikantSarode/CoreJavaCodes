package array;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		size = sc.nextInt();

		int[] arr = new int[size];
		arr[0] = 0;
		arr[1] = 1;

		System.out.print(arr[0] + " " + arr[1]);

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(" " + arr[i]);
		}
	}
}
