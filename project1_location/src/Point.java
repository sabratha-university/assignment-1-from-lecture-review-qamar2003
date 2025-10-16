public class Point extends SimpleLocation {
    private String name;

    public Point(double lat, double lon, String name) {
        super(lat, lon);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overriding toString() من SimpleLocation
    @Override
    public String toString() {
        return String.format("%s: %s", name, super.toString());
    }
}
