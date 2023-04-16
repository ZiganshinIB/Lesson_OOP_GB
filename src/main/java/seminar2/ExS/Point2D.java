package seminar2.ExS;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double len(Point2D other) {
        return (Math.pow((this.x - other.x), 2) +
                Math.pow((this.y-other.y), 2));
    }
}
