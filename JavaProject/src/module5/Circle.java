package module5;

import java.util.Scanner;

public class Circle {
	static final double PI;
	private float rad;
	private double area;
	private double peri;
	
	static {
		PI=3.142;
	}
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius: ");
		rad=sc.nextFloat();
		
	}
	public void display()
	{
		System.out.println("Area of Circle is: "+area );
		System.out.println("Perimeter of Circle is: "+peri );
	}
	public void area()
	{
		area=PI*rad*rad;
//		System.out.println(area);
	}
	public void peri()
	{
		peri=2* PI*rad;
//		System.out.println(peri);
	}

}
