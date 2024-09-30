package autoboxing;

public class AutoboxDemo {

	public static void main(String[] args) {
		int a=100;
		Integer i=a;
		i =a;//auto-boxing converting to obj
		System.out.println("Hashcode "+i.hashCode());
		System.out.println("=======================");
		System.out.println(i);
		
		int a1=i; //unboxing converting to primitive
		System.out.println(a1);
	}
}
