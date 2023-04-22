package seminar3.figure;

import seminar3.figure.base.Polygon;

public class Rectangle extends Polygon {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        super(4);
        if ((!(width > 0.))){ throw new RuntimeException("Ширина прямоугольника не может иметь значение: "+ width);}
        if ((!(height > 0.))) {throw new RuntimeException("Высота прямоугольника не может иметь значение: "+ height);}
        Double[] lensEge = new Double[] {width, height, width, height};
        super.setLensEge(lensEge);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной= "+ width+"; высотой= "+height;
    }

}
