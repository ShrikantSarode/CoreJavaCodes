package module4;

import java.util.Scanner;

public class Emp {
private int empno;
private String ename;
private double bal;

Scanner sc=new Scanner(System.in);
public void accept()
{
	System.out.println("Enter eNo, eName, balance: ");
	empno=sc.nextInt();
	ename=sc.next();
	bal=sc.nextDouble();
}
public void display() {
	System.out.println("Eno: "+empno);
	System.out.println("Name: "+ename);
	System.out.println("Balance: "+bal);
}
public void checkEmpNo() 
{
	//>0>valid empno
	if(empno>0)
	{
		System.out.println("Valid");
	}
	else
	{
		System.out.println("Invaild");
	}
}
public void checkBalance()
{
	//100000 >produce the proof
	if(bal>0 && bal<=100000)
	{
		System.out.println("Valid");
	}
	else
	{
		System.out.println("Invalid");
	}
}

}
