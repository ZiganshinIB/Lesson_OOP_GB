package seminar3.figure.base;

public abstract class Figure {
    public abstract Double getArea();

    @Override
    public String toString() {
        return "Это фигура имеет площадь: "+ getArea();
    }
}
