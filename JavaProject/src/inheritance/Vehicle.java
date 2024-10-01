package inheritance;

public class Vehicle {
	
	protected String brand;
	protected String model;
	protected int year;
	protected String color;
	protected double speed;

	public Vehicle(String brand, String model, int year, String color, double speed) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color + ", speed=" + speed
				+ "]";
	}
	

}
