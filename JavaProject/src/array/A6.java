package array;

public class A6 {

	public static void main(String[] args) {
        int[] arr = {1,1, 1, 2, 2, 2, 3};

     
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

    
        int[] countArray = new int[max + 1];

    
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            countArray[num] = countArray[num] + 1; // Alternative way to increment
        }

     
        for (int i = 1; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                System.out.println(i + "=" + countArray[i]);
            }
        }
    }
}
