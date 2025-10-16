/**
 * Point extends Shape and implements Movable.
 * Point يمثل نقطة بسيطة (قد تُستخدم كمسمى في المتطلبات الجديدة).
 */
public class Point extends Shape implements Movable {
    public Point() { super(); }
    public Point(String color, double x, double y) { super(color, x, y); }

    // area for point is zero
    @Override
    public double area() { return 0.0; }

    @Override
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public String toString() {
        return String.format("Point(color=%s, x=%.2f, y=%.2f)", getColor(), getX(), getY());
    }
}