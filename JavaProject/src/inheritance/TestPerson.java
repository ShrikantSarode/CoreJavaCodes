package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person= new Person("Shrikant", 22, 'M');
		System.out.println(person);
		person.fun1();
		person.display();
		System.out.println("===========================");
		
		Student student = new Student("Shrikant", 22, 'M', 1, "Computer Engineering", 99.99);
		System.out.println(student);
		student.display();
		
		System.out.println("===========================");
		
		Emp emp = new Emp("Shrikant", 22, 'M', 1, "Engineering", 99.99, 170519, "Capgemini", 12000000);
		
		System.out.println(emp);
		
		Student student2=new Emp("Ashu", 21, 'F', 1, "IT", 99.99, 170520, "Capgemini", 12000000);
		System.out.println(student2);
	}
}
