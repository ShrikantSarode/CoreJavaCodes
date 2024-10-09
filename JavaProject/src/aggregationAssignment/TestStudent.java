package aggregationAssignment;

class Name {
    String fName, mName, lName;

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }
}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student {
    protected int rollNo;
    protected Name name;
    protected Address address;

    public Student(int rollNo, Name name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("First Name: " + name.fName + ", Middle Name: " + name.mName + ", Last Name: " + name.lName);
        System.out.println("City: " + address.city + ", State: " + address.state + ", Country: " + address.country);
        System.out.println();
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Name n1 = new Name("Shrikant", "B", "Sarode");
        Name n2 = new Name("Aditi", "K", "Patil");
        Name n3 = new Name("Raj", "M", "Kumar");
        
        Address address1 = new Address("Mumbai", "Maharashtra", "India");
        Address address2 = new Address("Nashik", "Maharashtra", "India");
        Address address3 = new Address("Pune", "Maharashtra", "India");

        Student student1 = new Student(1, n1, address1);
        Student student2 = new Student(2, n2, address2);
        Student student3 = new Student(3, n3, address3);

        student1.display();
        student2.display();
        student3.display();
    }
}
