package Assignment6;

abstract public class GeometricShape {

	abstract void area();
	abstract void perimeter();
	
}
class Circle extends GeometricShape{

	double r;
	final double PI=3.142;
	@Override
	void area() {
		System.out.println("Area of Circle: "+PI*r*r);
		
	}
	
	@Override
	void perimeter() {
		System.out.println("Perimeter of Circle: "+2*PI*r*r);
		
	}
	
}
class Rectangle extends GeometricShape{

   double l=5,b=10;
	
	@Override
	void area() {
		 
		System.out.println("Area of Rectangle"+ l*b);
	}

	@Override
	void perimeter() {
		 
		System.out.println("Area of Rectangle: "+ 2*l*b);
	}
	
}
class Triangle extends GeometricShape{

	double a,b,h;
	@Override
	void area() {
		 System.out.println("Area of Triangle: "+ 0.5*b*h);
		
	}

	@Override
	void perimeter() {
		System.out.println("Area of Rectangle"+ a+b+h);
		
	}
	
}
