package assignment5;

public class Student {

	private String address;
	private String name;
	private int age;
	public Student() {
		super();
		name=null;
		age=0;
		address=null;
	}
	public Student(String address, String name, int age) {
		super();
		this.address = address;
		this.name = name;
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
