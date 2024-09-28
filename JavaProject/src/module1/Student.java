package module1;

public class Student {
	
	private int rollNo;
	private String name;
	private double score;
	
	public void attend()
	{
		System.out.println("Attend the class.");
	}
	public void apperExam()
	{
		System.out.println("Appear for exam.");
	}
	public void completeAssignment()
	{
		System.out.println("Complete Assignment.");
	}
	public void display()
	{
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Score: "+score);
	}
		
	public static void main(String[] args) {
		
		Student student1 =new Student();
		Student student2 =new Student();
		student1.rollNo=1;
		student1.name="Shri";
		student1.score=84.52;
		student1.display();
		student1.attend();
		student1.completeAssignment();
		student1.apperExam();
		System.out.println("====================");
		student2.rollNo=2;
		student2.name="Sandeep";
		student2.score=90.52;
		student2.display();
		student2.attend();
		student2.completeAssignment();
		student2.apperExam();
		System.out.println("====================");

	}

}
