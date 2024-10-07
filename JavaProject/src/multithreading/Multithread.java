package multithreading;

class Multithread extends Thread {
    private final Demo demo;

    public Multithread() {
        this.demo = new Demo();
    }

    public void run() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
        demo.fun1();
        demo.fun2();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Multithread thread = new Multithread();
            thread.start();
        }
    }
}

class Demo {
    public void fun1() {
        System.out.println("This is Fun1");
    }

    public void fun2() {
        System.out.println("This is Fun2");
    }
}
