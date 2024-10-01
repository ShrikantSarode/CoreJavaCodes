package inheritance;

public class Emp extends Student{

	private int empNo;
	private String company;
	private double sal;
	
	public Emp(String name, int age, char gender, int rollNo, String stream, double score, int empNo, String company,
			double sal) {
		super(name, age, gender, rollNo, stream, score);
		this.empNo = empNo;
		this.company = company;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp :\n empNo=" + empNo + "\n company=" + company + "\n sal=" + sal + "\n rollNo=" + rollNo + "\n stream="
				+ stream + ", score=" + score + "\n name=" + name + "\n age=" + age + "\n gender=" + gender;
	}
	
	
	
	
	
	
	
}
