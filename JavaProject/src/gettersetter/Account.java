package gettersetter;

public class Account {

	private int accNo;
	private String name;
	private double accBalance;
	
	
	public Account() {
		accNo=0;
		name="";
		accBalance=0.0;
	}


	public Account(int accNo, String name, double accBalance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.accBalance = accBalance;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAccBalance() {
		return accBalance;
	}


	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accBalance=" + accBalance + "]";
	}
	
	
	
	
	
}
