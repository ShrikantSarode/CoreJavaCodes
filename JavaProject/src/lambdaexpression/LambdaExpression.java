package lambdaexpression;

interface Interface1 { // This is a functional interface
    void absfun(int x); // Only one abstract method

    default void fun1() { // Non-abstract method
        System.out.println("This is fun1");
    }

    default void fun2() { // Another non-abstract method
        System.out.println("This is fun2");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method
        Interface1 fobj = (int x) -> System.out.println(10 * x);

        // Calling the abstract method
        fobj.absfun(5); // Outputs: 50

        // Calling the default methods
        fobj.fun1(); // Outputs: This is fun1
        fobj.fun2(); // Outputs: This is fun2
    }
}
