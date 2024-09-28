package array;

import java.util.Arrays;

//reverse array
public class A2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int start = 0,temp=0;
		int end = arr.length - 1;

		for(int i=0;i<arr.length;i++)
		{
			while (start < end) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			System.out.println(arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
	
	}
}
