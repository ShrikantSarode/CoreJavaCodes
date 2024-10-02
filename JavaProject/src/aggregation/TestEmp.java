package aggregation;

class Address{
	String city,state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
}
class Emp{
	int id;
	String name;
	Address address;//has a relationship : aggregation
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("City is "+address.city+" \nState is "+address.state+"\nCountry is "+address.country);
	}
	
	
}
public class TestEmp {

	public static void main(String[] args) {
		
		Address address1= new Address("Mumbai", "Maharashtra", "India");
		Address address2= new Address("Nashik", "Maharashtra", "India");
		Address address3= new Address("Pune", "Maharashtra", "India");
		
		Emp emp1= new Emp(1, "Ajay", address1);
		emp1.display();
		System.out.println("================================");
		Emp emp2= new Emp(2, "Ashivini", address2);
		emp2.display();
		System.out.println("================================");
		Emp emp3= new Emp(3, "Shrikant", address3);
		emp3.display();
	}
}
