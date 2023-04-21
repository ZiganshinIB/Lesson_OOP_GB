package seminar1.homework.base;

public abstract class BabyProduct extends Product {
    private Integer minimumAge;
    private Boolean hypoallergenic;

    public BabyProduct(String name, double price, int count, String unit, Integer minimumAge, Boolean hypoallergenic) {
        super(name, price, count, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    protected Integer getMinimumAge() {
        return minimumAge;
    }

    protected Boolean getHypoallergenic() {
        return hypoallergenic;
    }

    @Override
    protected String info(){
        return "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", minimumAge=" + minimumAge +
                ", hypoallergenic=" + hypoallergenic;
    }

    @Override
    public String toString() {
        return "BabyProduct{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice()+
                ", count=" + super.getCount() +
                ", unit='" + super.getUnit() + '\'' +
                ", minimumAge=" + minimumAge +
                ", hypoallergenic=" + hypoallergenic +
                '}';
    }
}
