package assignment5;

public class BankA extends Bank{

	public BankA(double bal, String name) {
		super(bal, name);
		
	}
	
	public double applyInterest()
	{
		double result= interest*bal;
		return result;
	}
	
	public BankA() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public double getBalance()
	{
	  double result=bal;
	  return result;
	}
	
	
}
