package seminar1.homework.base;

public abstract class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, int count, String unit, String expirationDate) {
        super(name, price, count, unit);
        this.expirationDate = expirationDate;
    }

    protected String getExpirationDate() {
        return expirationDate;
    }


    @Override
    protected String info() {
        return "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", expirationDate='" + expirationDate + '\'';
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
