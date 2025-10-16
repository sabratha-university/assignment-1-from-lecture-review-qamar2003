

public class Main {
    public static void main(String[] args) {
        // إنشاء كائن من الدائرة
        Circle circle = new Circle("Red", 0, 0, 5);

      
        circle.draw();


        // تحريك الدائرة
        circle.move(2, 3);



        // طباعة المساحات
        System.out.println("Circle area: " + circle.area());

    }
}