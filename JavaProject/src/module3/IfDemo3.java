package module3;

import java.util.Scanner;

public class IfDemo3 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number: ");
		int n = sc.nextInt();

		if(n<10 && n>0)
		{
			System.out.println(n+" is 1 digit.");
		}else if(n<100 && n>=10)
		{
			System.out.println(n+ " is 2 digits");
		}else if(n<1000 && n>=100)
		{
			System.out.println(n+ " is 3 digits");
		}else if(n<10000 && n>=1000)
		{
			System.out.println(n+ " is 4 digits");
		}
		

	}
}
