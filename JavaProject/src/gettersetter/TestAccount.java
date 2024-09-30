package gettersetter;

public class TestAccount {

	public static void main(String[] args) {
		
		Account  a1= new Account();
		a1.setAccNo(1);
		a1.setName("Shrikant");
		a1.setAccBalance(5000000);
		
		System.out.println(a1);
		System.out.println("=========================");
		
		Account  a2= new Account(2,"Ajay",400000);
		System.out.println(a2);
	}
}
