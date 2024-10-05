package assignment7;

public class P {

	int a,b;

	public P(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	 static int add(int a,int b) {
		
		if(a<0 || b<0)
		{
			throw new ArithmeticException("Number +ve");
			
		}
		return a+b;
	}
	
	public static void main(String[] args) {
		int a,b;
		try {
			int res=add(1,-1);
			System.out.println(res);
		}catch(ArithmeticException e)
		{
			System.out.println("Number not -ve");
		}
		
	}
}
