public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0, 4.0);
        Shape circle = new Circle(5.0);

        System.out.println("area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("area of the Circle: " + circle.calculateArea());
    }
}

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

 
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
