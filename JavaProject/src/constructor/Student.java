package constructor;

public class Student {

	private int Rollno;
	private String name;
	private Double score;
	


	public Student() {
		Rollno = 0;
		this.name = "";
		this.score = 0.0;
	}


	public Student(int rollno, String name, Double score) {

		this.Rollno = rollno;
		this.name = name;
		this.score = score;
	}


	public int getRollno() {
		return Rollno;
	}


	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public void markAttendance() {
		System.out.println("Attended.");
	}
}
