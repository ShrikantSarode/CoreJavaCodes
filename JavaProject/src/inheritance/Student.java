package inheritance;

public class Student extends Person {

	protected int rollNo;
	protected String stream;
	protected double score;

	public Student(String name, int age, char gender, int rollNo, String stream, double score) {
		super(name, age, gender);//calling constructor from the parent class
		this.rollNo = rollNo;
		this.stream = stream;
		this.score = score;
	}
	
	public void display()
	{
		super.display();
		super.fun1();
	}

	@Override
	public String toString() {
		return "Student:\n rollNo=" + rollNo + "\n stream=" + stream + "\n score=" + score + "\n name=" + name + "\n age="
				+ age + "\n gender=" + gender ;
	}
	
	

}
