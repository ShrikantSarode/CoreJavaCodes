package assignment5;

public class BankC extends Bank{

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
