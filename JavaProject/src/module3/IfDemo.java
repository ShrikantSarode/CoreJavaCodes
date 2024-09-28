package module3;

import java.util.Iterator;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		for(int i=0;i<=3;i++)
		{
			if(num>0)
			{
				System.out.println("Number is Prositive.");
			}
			else if(num==0)
			{
				System.out.println("Number is Zero");
			}
			else {
				System.out.println("Number is Negative.");
			}
		}
	}
}
