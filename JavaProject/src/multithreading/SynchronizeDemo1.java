package multithreading;

class Myclass implements Runnable {

	private static boolean flag = true;

	public synchronized void printEven() {
		long id = Thread.currentThread().getId();
		for (int i = 2; i < 20; i += 2) {
			System.out.println(i + " -> id is " + id);
		}

	}

	public synchronized void printOdd() {
		long id = Thread.currentThread().getId();
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i + " -> id is " + id);
		}
	}

	@Override
	public void run() {
		if(flag==true)
			printEven();
		else
			printOdd();
	}
}

public class SynchronizeDemo1 {

	public static void main(String[] args) {
		Myclass myclass = new Myclass()	;
		Thread t1 = new Thread(myclass);
		Thread t2 = new Thread(myclass);
		t1.start();//This will call the run method automatically
		t2.start();
		
	}
}
