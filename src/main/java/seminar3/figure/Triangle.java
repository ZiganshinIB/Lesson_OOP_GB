package seminar3.figure;

import seminar3.figure.base.Polygon;

public class Triangle extends Polygon {
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) {
        super(3);
        if ((!(side1 > 0.))){ throw new RuntimeException("Сторона 1 треугольника не может иметь значение: "+ side1);}
        if ((!(side2 > 0.))){ throw new RuntimeException("Сторона 2 треугольника не может иметь значение: "+ side2);}
        if ((!(side3 > 0.))){ throw new RuntimeException("Сторона 3 треугольника не может иметь значение: "+ side3);}
        if ((!(side1 < side2+side3))) {
            throw new RuntimeException("Треугольник со сторонами "+side1+ ">="+side2+"+"+side3+"; не существует");
        }
        if ((!(side2 < side1+side3))) {
            throw new RuntimeException("Треугольник со сторонами "+side2+ ">="+side1+"+"+side3+"; не существует");
        }
        if ((!(side3 < side2+side1))) {
            throw new RuntimeException("Треугольник со сторонами "+side3+ ">="+side2+"+"+side1+"; не существует");
        }
        Double[] lensEge = new Double[]{side1, side2, side3};
        super.setLensEge(lensEge);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

//S=√p (p-a) (p-b) (p-c)
    @Override
    public Double getArea() {
        Double p = getPeremetr();
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "Треугольник с a= "+ side1+"; b= "+side2+"; c= "+side3;
    }
    @Override
    public String typeName() {
        return "Треугольник";
    }
}
