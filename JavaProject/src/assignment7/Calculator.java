package assignment7;

import java.util.Scanner;

public class Calculator {

	private int n1, n2;

	public Calculator(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public static int add(int n1, int n2) {
		if (n1 < 0 || n2 < 0) {
			throw new ArithmeticException("Number should not be negative");
		}
		return n1 + n2;
	}

	public static int sub(int n1, int n2) {
		if (n1 < 0 || n2 < 0) {
			throw new ArithmeticException("Number should not be negative");
		}
		return n1 - n2;
	}

	public static int mul(int n1, int n2) {
		return n1 * n2;
	}

	public static int div(int n1, int n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int ch;
			do {				
				System.out.println("Welcome to my Calculator :) ");
				System.out.println("1.Add ");
				System.out.println("2.Sub ");
				System.out.println("3.Mul ");
				System.out.println("4.Div ");
				System.out.println("0.Exit ");
				System.out.println("Enter Your Choice: ");
				System.out.println("======================================");
				ch = sc.nextInt();
				System.out.println("======================================");
				
				

				switch (ch) {
				case 1:
					
					try {
						System.out.println("Addition");
						System.out.println("Enter any 2 number: ");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						int res1 = add(n1, n2);
						System.out.println(res1);
					}catch(ArithmeticException e1) {
						System.out.println("Enter only Positive Number");
						System.out.println("==================================");
					}
					break;
				case 2:
					try {
						System.out.println("Substraction");
						System.out.println("Enter any 2 number: ");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						int res2 = sub(n1, n2);
						System.out.println(res2);
					}catch(ArithmeticException e1) {
						System.out.println("Enter only Positive Number");
					}
					break;
				case 3:
					System.out.println("Multiplication");
					System.out.println("Enter any 2 number: ");
					int n1 = sc.nextInt();
					int n2 = sc.nextInt();
					int res3 = mul(n1, n2);
					System.out.println(res3);
					break;
				case 4:
					System.out.println("Division");
					System.out.println("Enter any 2 number: ");
					int n11 = sc.nextInt();
					int n21 = sc.nextInt();
					int res4 = div(n11, n21);
					System.out.println(res4);
					break;
				default:
					System.out.println("Invalid Choice");
				}
				
				if(ch!=0) {
					System.out.println("Do you want to continue??{Y/N}");
					String choice=sc.next();
					
					if(!choice.equalsIgnoreCase("Y")) {
						ch=0;
					}
				}
			}while (ch != 0);
			 System.out.println("Exit :) Visit Again");

		} 
	}

