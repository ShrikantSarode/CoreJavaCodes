package module2;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		
		
//		student1.accept();
		student1.display();
		student1.attend();	
		student1.completeAssignment();
		student1.apperExam();
		System.out.println("=======================");
		
		
		student2.accept();
		student2.display();
		student2.attend();	
		student2.completeAssignment();
		student2.apperExam();
		System.out.println("=======================");
		
		
		student3.accept();
		student3.display();
		student3.attend();
		student3.completeAssignment();
		student2.apperExam();
		System.out.println("=======================");
		

	}

}
