package module5;

public class OverloadMain {

	public void main()
	{
		System.out.println("Main 1");
	}
	public void main(int a)
	{
		System.out.println("Main 2");
	}
	public void main(int a,int b)
	{
		System.out.println("Main 3");
	}
	public static void main(String[] args) {
		
		OverloadMain obj = new OverloadMain();
		obj.main();
		obj.main(10);
		obj.main(10,20);
	}

}
