package seminar1.homework;

import seminar1.homework.base.Food;

public class Bread extends Food {
    private String typeFlour;

    public Bread(String name, double price, int count, String unit, String expirationDate, String typeFlour) {
        super(name, price, count, unit, expirationDate);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                super.info()+
                ", typeFlour='" + typeFlour + '\'' +
                '}';
    }
}
