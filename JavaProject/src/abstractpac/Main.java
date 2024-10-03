package abstractpac;

abstract class BankAccount {
    protected int id;
    protected float bal;

    public BankAccount(int id, float bal) {
        this.id = id;
        this.bal = bal;
    }

    abstract public float calInterest();   
}

class CurrentAccount extends BankAccount {
    private static final float INTEREST_RATE = 0.03f;  

    public CurrentAccount(int id, float bal) {
        super(id, bal);
    }

    @Override
    public float calInterest() {
        return bal * INTEREST_RATE;  
    }
}
class LoanAccount extends BankAccount{
	private static final float INTEREST_RATE = 0.10f; 
	
    public LoanAccount(int id, float bal) {
		super(id, bal);
	}

	@Override
    public float calInterest() {
        return bal * INTEREST_RATE;  
    }
}
class SavingAccount extends BankAccount{
	private static final float INTEREST_RATE = 0.56f; 
	
    public SavingAccount(int id, float bal) {
		super(id, bal);
	}

	@Override
    public float calInterest() {
        return bal * INTEREST_RATE;  
    }
}
 
public class Main {
    public static void main(String[] args) {
        CurrentAccount account1 = new CurrentAccount(1, 1000.0f);
        SavingAccount account2= new SavingAccount(1, 1000.0f);
        LoanAccount account3 = new LoanAccount(1, 1000.0f);
        System.out.println("Interest: " + account1.calInterest());
        System.out.println("Interest: " + account2.calInterest());
        System.out.println("Interest: " + account3.calInterest());
    }
}
