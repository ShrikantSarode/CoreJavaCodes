package java_assingment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {

	private int accNo;
	private String name;
	private double balance;

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String[] args) {

		Account account1 = new Account(1, "Shrikant", 5000000);
		Account account2 = new Account(2, "Ajay", 50000);
		Account account3 = new Account(3, "Amar", 50000000);
		Account account4 = new Account(4, "Akshay", 50000000);
		Account account5 = new Account(5, "Aaksh", 50000);
		Account account6 = new Account(6, "Ashu", 500000);
		ArrayList arrayList = new ArrayList();
		
		Emp emp1 = new Emp(1, "Raja", 789000);
		Emp emp2 = new Emp(2, "Harry", 999000);
		Emp emp3 = new Emp(3, "Potter", 1000);

		arrayList.add(account1);
		arrayList.add(account2);
		arrayList.add(account3);
		arrayList.add(account4);
		arrayList.add(account5);
		arrayList.add(account6);
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);

		
		Iterator itr2 = arrayList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("Emp3 is there ?: "+arrayList.contains(emp3));
		arrayList.remove(emp3);
		System.out.println("Emp3 is there ?: "+arrayList.contains(emp3));
		System.out.println("==========================");
		
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		arrayList.clear();
		System.out.println("isEmpty: "+arrayList.isEmpty());
		

		

	}

}
