package interfacepac;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle= new Circle(5);
		Rectangle rectangle=new Rectangle(5, 6);
	
		
		System.out.println("Circle Area is "+circle.area());
		System.out.println("Circle Perimeter "+circle.perimeter());
		System.out.println("Rectangle Area is "+rectangle.area());
		System.out.println("Rectangle Perimeter "+rectangle.perimeter());
	}
}
