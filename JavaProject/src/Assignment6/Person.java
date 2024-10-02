package Assignment6;

final public class Person {

	final String name;
	final int age;

	public Person() {

		name = "Shrikant";
		age = 22;
	}


	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name=name;
//	}


	public int getAge() {
		return age;
	}


	public void display() {
		System.out.println("Name is " + name + " age is " + age);
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.display();
		
	}

}
