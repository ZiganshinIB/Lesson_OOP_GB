package seminar1.homework.base;

public abstract class Product {
    private String name;
    private double price;
    private int count;
    private String unit;

    public Product(String name, double price, int count, String unit) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    protected String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
    }

    protected int getCount() {
        return count;
    }

    protected String getUnit() {
        return unit;
    }

    protected abstract String info();

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", unit='" + unit + '\'' +
                '}';
    }
}
