package inheritance;

public class Teacher extends Person{

	protected Double sal;

	public Teacher(String name, int age, String add, Double sal) {
		super(name, age, add);
		this.sal = sal;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Teacher [sal=" + sal + ", name=" + name + ", age=" + age + ", add=" + add + "]";
	}

	
	
	
	
	

	

}
