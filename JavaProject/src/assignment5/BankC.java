package assignment5;

public class BankC extends Bank{
double bal;
	public BankC(double bal, String name) {
		super(bal, name);
		
	}
	
	public double applyInterest()
	{
		bal= interest * bal;
		return bal;
	}
	
	public double getBalance()
	{
	  
	  return bal;
	}
}
