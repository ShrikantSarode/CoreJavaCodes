package inheritance;

public class Student extends Person {

    protected short rollNo;

    public Student(String name, int age, String address, short rollNo) {
        super(name, age, address);
        this.rollNo = rollNo; // Changed variable name to rollNo for clarity
    }

    public void toLearn() {
        System.out.println(name + " is learning at CDAC in " + add);
    }

    public short getRollNo() {
        return rollNo;
    }

    public void setRollNo(short rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + add + "]";
    }
}
