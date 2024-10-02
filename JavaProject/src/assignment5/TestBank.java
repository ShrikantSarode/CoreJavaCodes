package assignment5;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bank1 = new BankA(1000,"name");
		Bank bank2 = new BankB(1500,"name");
		Bank bank3 = new BankC(2000,"name");
		
		System.out.println("Bank A Details");
				
		System.out.println("Interest is "+bank1.applyInterest());
		System.out.println("Balance is "+bank1.getBalance());
		System.out.println("==============================================");
		
		System.out.println("Bank B Details");
		
		System.out.println("Interest is "+bank2.applyInterest());
		System.out.println("Balance is "+bank2.getBalance());
		System.out.println("==============================================");
		
		System.out.println("Bank C Details");
		
		System.out.println("Interest is "+bank3.applyInterest());
		System.out.println("Balance is "+bank3.getBalance());
		System.out.println("==============================================");

	}

}
