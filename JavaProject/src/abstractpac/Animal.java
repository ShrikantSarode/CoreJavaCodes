package abstractpac;

abstract class Animal {
    final int legs = 4;

    abstract public void sound();

    abstract public void fun1();

    abstract public void fun2();

    public void ClassInfo(String type) {
        System.out.println("It belongs to " + type + " and has " + legs + " legs.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void fun1() {
        System.out.println("This is Fun1 from Dog");
    }

    @Override
    public void fun2() {
        System.out.println("This is Fun2 from Dog");
    }
}

class Loin extends Animal {  // Fixed class name to Lion
    @Override
    public void sound() {
        System.out.println("Lion Roars");
    }

    @Override
    public void fun1() {
        System.out.println("This is Fun1 from Lion");
    }

    @Override
    public void fun2() {
        System.out.println("This is Fun2 from Lion");
    }
}
