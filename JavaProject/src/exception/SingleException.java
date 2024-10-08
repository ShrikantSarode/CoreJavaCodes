package exception;

import java.util.Scanner;

public class SingleException {
	
	public static double divide(int n1,int n2)
	{
		return n1/n2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter any 2 numbers: ");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			double result= divide(n1,n2);
			System.out.println("Divide: "+result);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Cannot divide number by zero");// 1st way
//			e.printStackTrace(); 2nd way
//			System.out.println(e.getMessage()); //3rd way
			System.out.println(e);
		}		
	}
}
