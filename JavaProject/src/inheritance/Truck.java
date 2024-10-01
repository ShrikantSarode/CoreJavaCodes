package inheritance;

public class Truck extends Vehicle {

	private double payloadCapacity;

	public Truck(String brand, String model, int year, String color, double speed, double payloadCapacity) {
		super(brand, model, year, color, speed);
		this.payloadCapacity = payloadCapacity;
	}

	@Override
	public String toString() {
		return "Truck [payloadCapacity=" + payloadCapacity + ", brand=" + brand + ", model=" + model + ", year=" + year
				+ ", color=" + color + ", speed=" + speed + "]";
	}

	

}
