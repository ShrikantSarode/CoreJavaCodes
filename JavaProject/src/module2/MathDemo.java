package module2;
import java.lang.Math;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.random());
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-66));
		System.out.println(Math.min(10,20));
		System.out.println(Math.max(10,20));
		System.out.println(Math.floor(10.20));
		System.out.println(Math.ceil(10.20));
		double d=(int)(Math.random() * 1000000);
		System.out.println("d is "+d);
		System.out.println(Math.round(d));
	}
}
