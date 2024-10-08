package generics;

class Myclass{
	//Generic method to print array will diff data type
	
	public <E> void printArray(E[] arr1) {//E[]=type of array 
		for(E i:arr1) {			//para
		//E=data type			
			System.out.println(i);
		}
		System.out.println("===============================");
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		//pass integer array
		int[] arr= {1,2,3,4,5,65};
		Integer[] arrInt= {22,33,44,565};
		myclass.printArray(arrInt);
		
		Double[] arrdDouble = {10.33,2.55,65.2,99.1};
		myclass.printArray(arrdDouble);
	}
	
}
