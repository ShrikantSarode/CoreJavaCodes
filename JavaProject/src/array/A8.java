package array;

import java.util.Scanner;

public class A8 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[10];
		int e=0,o=0;
		
		System.out.println("Enter Array of 10: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]%2==0)
			{
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("Even= "+e);
		System.out.println("Odd0-0-0= "+o);
		
	}

}
