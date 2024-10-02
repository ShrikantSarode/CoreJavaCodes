package Static;

public class StaticVarDemo {

	static int num=1;
	
	public void display()
	{
		num++;
		System.out.println(num);
	}
	public static void main(String[] args) {
//		System.out.println(num);//1
//		System.out.println(StaticVarDemo.num);//1
		
		StaticVarDemo s1= new StaticVarDemo();
		s1.display();
	}
}
