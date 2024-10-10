package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class Emp implements Serializable {
	private static final long serialVersionUID = 1L; // recommended for Serializable classes
	private int emoId;
	private String eName;
	private double salary;

	public Emp(int emoId, String eName, double salary) {
		this.emoId = emoId;
		this.eName = eName;
		this.salary = salary;
	}

	public int getEmoId() {
		return emoId;
	}

	public void setEmoId(int emoId) {
		this.emoId = emoId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Emp{" + "emoId=" + emoId + ", eName='" + eName + '\'' + ", salary=" + salary + '}';
	}
}

public class Serialization {

	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "Shrikant", 1500000);

		// Serialization
		try (FileOutputStream fileOut = new FileOutputStream("D:\\shri.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(emp1);
			System.out.println("Serialized data is saved in D:\\shri.txt");
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		}

		// Deserialization
		try (FileInputStream fileIn = new FileInputStream("D:\\shri.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			Emp empDeserialized = (Emp) in.readObject();
			System.out.println("Deserialized Emp: " + empDeserialized);
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException occurred: " + e.getMessage());
		}
		System.out.println("==========================================");
		System.out.println("Deserialization is Successfull..");
		System.out.println("Id is: "+emp1.getEmoId());
		System.out.println("eName is: "+emp1.geteName());
		System.out.println("Salaray is: "+emp1.getSalary());
	}
}
