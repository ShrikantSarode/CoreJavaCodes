package module5;

public class Overloadingdemo {

	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static int  add(int a,int b,int c)
	{
		return (a+b+c);
	}
	public static double add(double a,int b)
	{
		return (a+b);
	}
	public static void main(String[] args) {
		int result1=add(10,20);
		System.out.println(result1);
		
		int result2=add(10,20,1);
		System.out.println(result2);
		
		double result3=add(1.5,2);
		System.out.println(result3);

	}

}
