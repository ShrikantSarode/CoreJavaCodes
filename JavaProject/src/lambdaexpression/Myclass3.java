package lambdaexpression;

interface Interface3 {
	void absfun(int x, int y, int z);
}

public class Myclass3 {

	public static void main(String[] args) {
		Interface3 fobj = (int x, int y, int z) -> {
			System.out.println("X square is " + x * x);
			System.out.println("Multiplication is " + (x * y * z));
			System.out.println("Addition is " + (x + y + z));
			System.out.println("Multiple is " + (z * 66));
		};
		fobj.absfun(4, 2, 3);
	}

}
