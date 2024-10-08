package collectionframework;

public class Employee {

	private int eId;
	private String name;
	private double sal;

	public Employee() {
		eId = 0;
		name = null;
		sal = 0.0;
	}

	public Employee(int eId, String name, double sal) {
		super();
		this.eId = eId;
		this.name = name;
		this.sal = sal;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", sal=" + sal + "]";
	}

}
