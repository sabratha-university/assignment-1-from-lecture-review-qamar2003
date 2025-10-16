/**
 * Circle extends Shape and implements Movable and Adjustable.
 * مثال على الوراثة و implements.
 */
public class Circle extends Shape implements Movable, Adjustable {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // overriding abstract method area() من Shape
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Overloading example: two draw methods (different signatures)
    @Override
    public void draw() {
        // Overriding draw() from Shape (not abstract) to give more details
        System.out.printf("Circle at (%.2f, %.2f), color=%s, radius=%.2f%n",
                getX(), getY(), getColor(), radius);
    }

    // overloaded draw with scale (example Overloading inside same class)
    public void draw(double scale) {
        System.out.printf("Circle (scaled %.2f): center=(%.2f,%.2f), radius=%.2f%n",
                scale, getX(), getY(), radius * scale);
    }

    // Movable
    @Override
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    // Adjustable
    @Override
    public void resize(double factor) {
        if (factor > 0) radius *= factor;
    }

    @Override
    public String toString() {
        return String.format("Circle(color=%s, x=%.2f, y=%.2f, r=%.2f)",
                getColor(), getX(), getY(), radius);
    }
}