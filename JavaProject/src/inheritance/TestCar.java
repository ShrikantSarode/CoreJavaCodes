package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Vehicle car=new SportCar("BMW", "S1", 2024, "Black", 300,200);		
		System.out.println(car);
		
		System.out.println("==================================");
		
		Vehicle car2=new Truck("Eicher", "M55", 2023, "Red", 150, 500);
		System.out.println(car2);
	}
}
