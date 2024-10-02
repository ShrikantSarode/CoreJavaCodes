package assignment5;

public class BankB extends Bank{

	public BankB(double bal, String name) {
		super(bal, name);
		
	}
	
	public double applyInterest()
	{
		double result= interest*bal;
		return result;
	}
	
	public double getBalance()
	{
	  double result=bal;
	  return result;
	}
}
