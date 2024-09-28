package module5;
class Myclass1{
	
	public void fun1()
	{
		System.out.println("This is fun1.");
	}
}
class Myclass2{
	
	public void fun2()
	{
		System.out.println("This is fun2.");
	}
}
class Myclass3{
	
	public void fun3()
	{
		System.out.println("This is fun3.");
	}
}
public class Myclass {

	public static void main(String[] args) {
		Myclass1 myclass1 =new Myclass1();
		myclass1.fun1();
		
		Myclass2 myclass2 =new Myclass2();
		myclass2.fun2();
		
		Myclass3 myclass3 =new Myclass3();
		myclass3.fun3();
	}
}
