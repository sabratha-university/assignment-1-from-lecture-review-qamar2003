public class MainShapes {
    public static void main(String[] args) {
        // انشاء اشكال
        Circle c = new Circle("red", 10.0, 20.0, 5.0);
        Point p = new Point("blue", 0.0, 0.0);

        // Polymorphism: referece type = Shape, actual object = Circle / Point
        Shape s1 = c;
        Shape s2 = p;

        System.out.println("Area of s1 (Circle): " + s1.area());
        System.out.println("Area of s2 (Point): " + s2.area());

        // Overriding demo: draw() overridden in Circle (and Shape has default draw)
        s1.draw(); // calls Circle.draw() because runtime object is Circle
        s2.draw(); // calls Shape.draw()

        // Overloading demo: circle has draw() and draw(double)
        c.draw();
        c.draw(1.5);

        // Movable behavior
        if (c instanceof Movable) {
            ((Movable) c).move(3.0, -2.0);
            System.out.println("Moved circle: " + c);
        }
        if (p instanceof Movable) {
            ((Movable) p).move(1.0, 1.0);
            System.out.println("Moved point: " + p);
        }

        // Adjustable
        c.resize(1.2);
        System.out.println("Resized circle radius -> area: " + c.area());
    }
}
