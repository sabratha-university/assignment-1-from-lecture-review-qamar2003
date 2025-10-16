/**
 * Abstract base class for shapes.
 * يحتوي على الخصائص المشتركة والمناهج الأساسية.
 */
public abstract class Shape {
    // encapsulated attributes
    private String color;
    private double x;
    private double y;

    public Shape() {
        this("black", 0.0, 0.0);
    }

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // getters / setters (Encapsulation)
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // common method
    public void draw() {
        System.out.println("Drawing shape at (" + x + ", " + y + "), color=" + color);
    }

    // abstract method — subclasses must implement area()
    public abstract double area();
}
