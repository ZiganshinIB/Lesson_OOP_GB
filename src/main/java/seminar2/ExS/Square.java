package seminar2.ExS;

import seminar2.ExS.schollers.base.Figure;

public class Square implements Figure {
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;
    private Point2D point4;

    public Square(Point2D point1, Point2D point2, Point2D point3, Point2D point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point2D getPoint1() {
        return point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public Point2D getPoint3() {
        return point3;
    }

    public Point2D getPoint4() {
        return point4;
    }

    @Override
    public double arial() {
        return this.point1.len(point2) * this.point2.len(point3);
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
