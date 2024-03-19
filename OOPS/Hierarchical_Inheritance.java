class Shape {
    public void display() {
        System.out.println("Displays area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int base, int height) {
        System.out.println("Area = " + (0.5 * base * height));
    }
}

class Circle extends Shape {
    public void area(int radius) {
        System.out.println("Area = " + (3.14 * radius * radius));
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.display();
        triangle.area(5, 7);

        Circle circle = new Circle();
        circle.display();
        circle.area(4);
    }
}
