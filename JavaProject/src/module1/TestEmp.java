package module1;

import module2.Emp;

public class TestEmp {

	public static void main(String[] args) {
		Emp emp = new Emp();

		emp.accept();
		emp.display();
		emp.completeProject();
		emp.checkAttendance();
		emp.applyLoan();
	}
}
