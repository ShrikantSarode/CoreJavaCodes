package module3;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter any Number2: ");
		int b = sc.nextInt();
		
		System.out.println("Enter any Number3: ");
		int c = sc.nextInt();
		
		if (a > b && a>c && a>0) {
			System.out.println("Number 1 is Greater and Positive."+a);
		} else if(c>a && c>b)
		{
			System.out.println("Number 3 is Greater."+c);
		}else {
			System.out.println("Number 2 is Greater."+b);
		}

	}

}
