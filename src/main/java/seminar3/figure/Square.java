package seminar3.figure;

public class Square extends Rectangle{
    private Double side;
    public Square(Double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат с a= "+ side;
    }

    @Override
    public String typeName() {
        return "Квадрат";
    }
}
