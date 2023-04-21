package seminar1.homework.base;

public abstract class Hygiene extends Product {
    private Integer countInPackage;

    public Hygiene(String name, double price, int count, String unit, Integer countInPackage) {
        super(name, price, count, unit);
        this.countInPackage = countInPackage;
    }

    protected Integer getCountInPackage() {
        return countInPackage;
    }

    @Override
    protected String info() {
        return  "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", countInPackage=" + countInPackage;
    }

    @Override
    public String toString() {
        return "Hygiene{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", countInPackage=" + countInPackage +
                '}';
    }
}
