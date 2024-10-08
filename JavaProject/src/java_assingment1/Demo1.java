package java_assingment1;

class Myclass1 implements Runnable {

	@Override
	public void run() {
		checkNatural();
		System.out.println("++++++++++++++++++++++++++++++++++");
		checkPrime();
		System.out.println("===================================");
	}

	public synchronized void checkPrime() {
	    int n = 30;
	    System.out.println("1st 10 Prime numbers:");
	    for (int i = 2; i < n; i++) {
	        boolean isPrime = true;

	      
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        
	        if (isPrime) {
	            System.out.println(i);
	        }
	    }
	}

	public synchronized void checkNatural() {
		System.out.println("Natural numbers from 20 to 30:");
		for (int i = 20; i <= 30; i++) {
			System.out.println(i);
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Myclass1 myclass1 = new Myclass1();
		Thread t1 = new Thread(myclass1);
		Thread t2 = new Thread(myclass1);
		t1.start();
		t2.start();
	}
}
