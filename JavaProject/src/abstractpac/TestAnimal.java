package abstractpac;

public class TestAnimal {

	public static void main(String[] args) {
		Dog animal1=new Dog();
		animal1.ClassInfo("Dog");
		animal1.fun1();
		animal1.fun2();
		System.out.println("===========================");
		
		Loin loin = new Loin();
		loin.ClassInfo("Loin");
		
	}
}
