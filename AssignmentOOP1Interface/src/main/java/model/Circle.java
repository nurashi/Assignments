package model;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    // Circle doesn't have a perimeter, to fix that I can create another Interface, but in that case i can do it without another interface;
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
