package seminar3.figure;

import seminar3.figure.base.CurvedLen;
import seminar3.figure.base.Figure;

public class Circle extends Figure implements CurvedLen {
    private Double radius;

    public Circle(Double radius) {
        if ((!(radius > 0.))) {throw new RuntimeException("Радиус круга не может иметь значение: "+ radius);}
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public Double getLen() {
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом= "+ radius;
    }
}
