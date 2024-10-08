package inheritance;

public class SportCar extends Vehicle {
	
	protected double horsepower;

	public SportCar(String brand, String model, int year, String color, double speed, double horsepower) {
		super(brand, model, year, color, speed);
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "SportCar [horsepower=" + horsepower + ", brand=" + brand + ", model=" + model + ", year=" + year
				+ ", color=" + color + ", speed=" + speed + "]";
	}
	
	

}
