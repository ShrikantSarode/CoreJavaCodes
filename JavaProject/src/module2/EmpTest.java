package module2;

public class EmpTest {
	public static void main(String[] args) {
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();

		emp1.accept();
		emp1.display();
		emp1.checkAttendance();
		emp1.completeProject();
		emp1.applyLoan();
		System.out.println("======================");

		emp2.accept();
		emp2.display();
		emp2.checkAttendance();
		emp2.completeProject();
		emp2.applyLoan();
		System.out.println("======================");
		emp1.display();
		emp2.display();
	}

}
