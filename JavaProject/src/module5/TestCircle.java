package module5;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle circle1= new Circle();
		Circle circle2= new Circle();
		Circle circle3= new Circle();
		
		
		circle1.accept();
		circle1.area();
		circle1.peri();
		circle1.display();
		System.out.println("Circle1 hashCode() is : "+circle1.hashCode());
		System.out.println("Circle2 hashCode() is : "+circle2.hashCode());
		System.out.println("Circle3 hashCode() is : "+circle2.hashCode());
		System.out.println("Circle2 is comparing to Circle1 object is : "+circle2.equals(circle1));

	}

}
