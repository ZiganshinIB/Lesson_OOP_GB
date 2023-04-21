package seminar1.homework;

import seminar1.homework.base.Food;

public class Eggs extends Food {
    private Integer countInPackage;

    public Eggs(String name, double price, int count, String unit, String expirationDate, Integer countInPackage) {
        super(name, price, count, unit, expirationDate);
        this.countInPackage = countInPackage;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                super.info()+
                "countInPackage=" + countInPackage +
                '}';
    }
}
