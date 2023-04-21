package seminar1.homework;

import seminar1.homework.base.Drink;

public class Milk extends Drink {
    private Double percentOfContent;
    private String expirationDate;

    public Milk(String name, double price, int count, String unit, Double volume, Double percentOfContent, String expirationDate) {
        super(name, price, count, unit, volume);
        this.percentOfContent = percentOfContent;
        this.expirationDate = expirationDate;
    }

    public Double getPercentOfContent() {
        return percentOfContent;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Milk{" +
                super.info()+
                "percentOfContent=" + percentOfContent +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
