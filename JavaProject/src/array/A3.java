package array;

import java.util.Arrays;

public class A3 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,7,8,9,6,4,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("This is 2nd highest: "+(arr.length-1));
	}
}
