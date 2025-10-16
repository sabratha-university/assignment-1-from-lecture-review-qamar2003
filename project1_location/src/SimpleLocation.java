 // عدّلي package حسب مشروعك لو لازم

public class SimpleLocation {
    // مغلف: private
    private double latitude;
    private double longitude;

    // Constructors (Overloading example: constructors مختلفة)
    public SimpleLocation() {
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    public SimpleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Encapsulation: getters & setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Distance to another SimpleLocation (Haversine)
    public double distanceTo(SimpleLocation other) {
        return distanceTo(other.getLatitude(), other.getLongitude());
    }

    // Overloaded method: distanceTo by lat/lon (this is Overloading)
    public double distanceTo(double lat2, double lon2) {
        final int R = 6371; // Earth radius in km
        double lat1Rad = Math.toRadians(this.latitude);
        double lat2Rad = Math.toRadians(lat2);
        double deltaLat = Math.toRadians(lat2 - this.latitude);
        double deltaLon = Math.toRadians(lon2 - this.longitude);

        double a = Math.sin(deltaLat/2) * Math.sin(deltaLat/2)
                + Math.cos(lat1Rad) * Math.cos(lat2Rad)
                * Math.sin(deltaLon/2) * Math.sin(deltaLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distance = R * c; // in kilometers
        return distance;
    }

    @Override
    public String toString() {
        return String.format("Location(lat=%.6f, lon=%.6f)", latitude, longitude);
    }
}