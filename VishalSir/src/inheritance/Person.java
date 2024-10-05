package inheritance;

public class Person {

	protected String name;
	protected int age;
	protected String add;
	
	public Person(String name, int age, String add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
	
	
	
	
	
}
