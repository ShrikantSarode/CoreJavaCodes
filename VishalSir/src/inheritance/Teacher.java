package inheritance;

public class Teacher extends Person {

    protected Double salary; // Changed from 'sal' to 'salary'

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be non-negative");
        }
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be non-negative");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [salary=" + salary + ", name=" + name + ", age=" + age + ", address=" + add + "]";
    }
}
