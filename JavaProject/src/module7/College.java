package module7;
class Stream{
	private String type;
	private int fees;
	private int noOfStudent;
	public Stream(String type, int fees, int noOfStudent) {
		super();
		this.type = type;
		this.fees = fees;
		this.noOfStudent = noOfStudent;
	}
	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noOfStudent=" + noOfStudent + "]";
	}
	
	
}

public class College {

	private String name;
	private char grade;
	private String address;
	private String contactNO;
	
	public College(String name, char grade, String address, String contactNO) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNO = contactNO;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNO=" + contactNO + "]";
	}
	
	
	
}
