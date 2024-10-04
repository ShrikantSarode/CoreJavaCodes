package exception;

//import java.util.Scanner;

public class MultiExceptionDemo {

	public static double divide(int n1, int n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		try {
			String str1 = new String("100");
			String str2 = new String("5");
			System.out.println("Enter any 2 numbers: ");
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);

			double result = divide(n1, n2);
			System.out.println("Divide is: " + result);

		} catch (ArithmeticException e1) {
			System.out.println("Cannot be divided by zero");
		} catch (NumberFormatException e2) {
			System.out.println("String as input not allowed");
		} catch (Exception e) {
			System.out.println("Error is there.");
		}

	}
}
