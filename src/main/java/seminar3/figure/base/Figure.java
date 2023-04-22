package seminar3.figure.base;

public abstract class Figure {
    public abstract Double getArea();
    public abstract String typeName();

    @Override
    public String toString() {
        return "Это "+typeName()+"имеет площадь: "+ getArea();
    }
}
