package constructor;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll, name, score: ");
		int Rollno=sc.nextInt();
		String name=sc.next();
		double score=sc.nextDouble();
		
		Student s1 = new Student();
		s1.setRollno(Rollno);
		s1.setName(name);
		s1.setScore(score);
//		s1.display();
		System.out.println("Roll No: "+s1.getRollno());
		System.out.println("Name: "+s1.getName());
		System.out.println("Score: "+s1.getScore());
		s1.markAttendance();
		System.out.println("===========================");
		
             Student s2 = new Student();
		s2.setRollno(Rollno);
		s2.setName(name);
		s2.setScore(score);
	
		System.out.println("Roll No: "+s2.getRollno());
		System.out.println("Name: "+s2.getName());
		System.out.println("Score: "+s2.getScore());
		
		System.out.println("enter the new name");
		String newName=sc.next();
		System.out.println("The new name is"+newName);
		s1.markAttendance();

	}
}
	