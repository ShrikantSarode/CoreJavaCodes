package multithreading;

class Multithreading1 implements Runnable { // Runnable interface

    public void fun1() {
        System.out.println("This is Fun1");
    }

    public void fun2() {
        System.out.println("This is Fun2");
    }

    @Override
    public void run() {
        fun1();
        fun2();
        
        // Printing thread details in the run method
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class Multithread1 {

    public static void main(String[] args) {
        Multithreading1 obj1 = new Multithreading1();
        Thread t1 = new Thread(obj1);
        t1.start();
        
        System.out.println("===============================");
        
        Multithreading1 obj2 = new Multithreading1();
        Thread t2 = new Thread(obj2);
        t2.start();
        
        // Optionally, you can print the thread details after starting it
        System.out.println("Main thread ID: " + t1.getId());
        System.out.println("Main thread Name: " + t1.getName());
    }
}
