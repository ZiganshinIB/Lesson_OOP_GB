package seminar1.homework.base;

public abstract class Drink extends Product {
    private Double volume;

    public Drink(String name, double price, int count, String unit, Double volume) {
        super(name, price, count, unit);
        this.volume = volume;
    }

    protected Double getVolume() {
        return volume;
    }

    @Override
    protected String info() {
        return "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", volume=" + volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", volume=" + volume +
                '}';
    }
}
