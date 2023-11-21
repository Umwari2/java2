// Interface for the first set of functionality
interface Interface1 {
    void method1();
}

// Interface for the second set of functionality
interface interface1 {
    void method2();
}

// Class implementing both interfaces
class interface1 {
    @Override
    public void method1() {
        System.out.println("Implementing method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementing method2");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Call methods from both interfaces
        myObject.method1();
        myObject.method2();
    }
}
