// Base interface
interface Shape {
    void draw();
}

// Derived interface inheriting from Shape
interface ColorableShape extends Shape {
    void setColor(String color);
}

// Concrete class implementing ColorableShape
class interface2 {
    private String color;

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting circle color to: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Circle
        Circle myCircle = new Circle();

        // Call methods from both interfaces
        myCircle.draw();
        myCircle.setColor("Red");
    }
}
