public class Wheel {

    private int radius;
    private int width;

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", width=" + width +
                '}';
    }

    public Wheel(int radius, int width) {
        this.radius = radius;
        this.width = width;
    }
}
