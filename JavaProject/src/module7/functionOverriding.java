package module7;

 class Shape {

	void calArea(String shape,int a, int b)
	{
		System.out.println("calArea of shape class");
	}
	 void display()
	{
		System.out.println("display of shape class");
	}
	void fun1()
	{
		System.out.println("fun1 of shape class");
	}
}
class Reactangle extends Shape
{
	void calArea(String shape,int a, int b)
	{
		System.out.println("Area of Rectangle: "+a*b);
	}
	void display()
	{
		super.display();
		System.out.println("display of Rectangle class");
	}
	
}
public class functionOverriding{
	public static void main(String[] args) {
		
		Shape shape1=new Shape();//Static binding
		shape1.calArea("Rectangle", 51, 11);
		shape1.display();
		shape1.fun1();
		System.out.println("===============================");
		Shape shape2=new Reactangle();//Dynamic binding
		shape2.calArea("Rectangle", 5, 5);
		shape2.display();
		shape2.fun1();
		
	}
}