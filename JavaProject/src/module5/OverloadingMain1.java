package module5;

public class OverloadingMain1 {

	public static void main()
	{
		System.out.println("Main 1");
	}
	public static int main(int a)
	{
		System.out.println("Main 2");
		return a;
	}
	public static int main(int a,int b)
	{
		System.out.println("Main 3");
		return (a+b);
	}
	public static void main(String[] args) {
		int result1=main(10);
		int result2=main(10,20);
		main();
	}
}
