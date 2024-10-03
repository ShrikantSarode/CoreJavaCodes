package interfacepac;

public class Rectangle implements Graphics {

	float l ;
	float b;
	
	
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return ( l *b);
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return (2 * l *b);
	}

}
