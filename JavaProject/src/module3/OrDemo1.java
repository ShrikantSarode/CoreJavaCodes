package module3;

public class OrDemo1 {

	public static void main(String[] args) {
		int a =1000;
		int b =1000;
		int c=300;
		
		if(a==b)
		{
			System.out.println("Same.");
		}
		if(a>b || a>c)
		{
			System.out.println("Any one condition is True.");
		}
		if(a !=b )
		{
			System.out.println("Both are different.");
		}
	}
}
