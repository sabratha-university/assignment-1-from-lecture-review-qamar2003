
public class Main {
    public static void main(String[] args) {
        // 1) ضعي هنا إحداثيات بيتك (latitude, longitude)
        SimpleLocation myHome = new SimpleLocation(32.8475965, 12.0611684); // مثال: عدّليها بإحداثيات بيتك

        // 2) إحداثيات كلية تقنية المعلومات - جامعة صبراتة
        // لو ما تعرفي الإحداثيات بالضبط: افتحي Google Maps، كليك يمين على الموقع -> "What's here" -> انسخي الإحداثيات
        SimpleLocation itCollege = new SimpleLocation(32.8524758, 12.0615862); // مثال تقريبي — عدّليه حسب اللي تعرفيه

        // حساب المسافة (نستخدم الميثود overloaded)
        double distKm = myHome.distanceTo(itCollege);
        System.out.printf("Distance from your home to IT College (Sebrata) = %.3f km%n", distKm);

        // مثال على Overloading: استدعاء الدالة عبر الإحداثيات مباشرة
        double distKm2 = myHome.distanceTo(32.8524758, 12.0615862);
        System.out.printf("Distance (using overloaded method) = %.3f km%n", distKm2);
// مثال على Overriding: استخدام Point مع اسم
        Point homePoint = new Point(32.759, 13.053, "My Home");
        Point collegePoint = new Point(32.7625, 13.0038, "IT College Sebrata");
        System.out.println(homePoint);
        System.out.println(collegePoint);
    }
}


