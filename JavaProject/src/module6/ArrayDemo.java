package module6;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		
		System.out.println("Enter Array of 5 size: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("=====================");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("=======================");
		
		for(int temp:arr)//enhace for loop
		{
			System.out.println(temp);
		}
		
		
		
	}
}
