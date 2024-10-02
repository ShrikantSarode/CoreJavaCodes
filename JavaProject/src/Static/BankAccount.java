package Static;

public class BankAccount {
	
	private int accNo;
	private double bal;
	private static int idNum=1;
	
	
	public BankAccount() {
		accNo=idNum++;
		bal=0;
	}
	
	public BankAccount(double bal) {
		
		this.accNo = idNum++;
		this.bal = bal;
	}

	public static int getIdNum()
	{
		return idNum;
	}
	
	

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", bal=" + bal + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(idNum);
		BankAccount account1=new BankAccount(6000);//2
		BankAccount account2=new BankAccount(6000);//3
		BankAccount account3=new BankAccount(6000);//4
	
		System.out.println(getIdNum());//4
		System.out.println(getIdNum());//4
		System.out.println(getIdNum());//4
		System.out.println(getIdNum());//4
		System.out.println(getIdNum());//4
//		System.out.println(BankAccount.getIdNum());
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
	}

}
