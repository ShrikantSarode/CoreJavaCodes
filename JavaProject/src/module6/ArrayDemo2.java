package module6;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 12 element: ");
		int[][] arr=new int[3][4];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("========================");
		System.out.println("Display the arr");
		System.out.println("RollNo        C++              Java               Mysql");
		System.out.println("================================================================");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}
