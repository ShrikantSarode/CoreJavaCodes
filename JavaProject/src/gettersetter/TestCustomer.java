package gettersetter;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setCusId(1);
		c1.setName("shri");
		c1.setMobile("(+91)123455685");
		c1.setAddress("Nashik");
//
//		System.out.println("" + c1.getCusId());
//		System.out.println("" + c1.getName());
//		System.out.println("" + c1.getMobile());
//		System.out.println("" + c1.getAddress());

		System.out.println("==========================");

		Customer c2 = new Customer(2, "Ajay"," (+91)587459568", "Pune");
//		System.out.println("" + c2.getCusId());
//		System.out.println("" + c2.getName());
//		System.out.println("" + c2.getMobile());
//		System.out.println("" + c2.getAddress());
		System.out.println(c1);
		System.out.println(c2);
	}
}
