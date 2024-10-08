package assignment5;

public class Bank {

	protected double bal;
	protected String name;
	protected static double interest=0.05;
	
	
	public Bank() {
		
		bal=0;
		name=null;
	}
	public Bank(double bal, String name) {
		super();
		this.bal = bal;
		this.name = name;
	}
	
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Bank [bal=" + bal + ", name=" + name + "]";
	}
	
}
