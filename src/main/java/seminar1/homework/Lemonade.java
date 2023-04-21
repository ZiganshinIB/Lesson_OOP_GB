package seminar1.homework;

import seminar1.homework.base.Drink;

public class Lemonade extends Drink {
    public Lemonade(String name, double price, int count, String unit, Double volume) {
        super(name, price, count, unit, volume);
    }

    @Override
    public String toString() {
        return "Lemonade{"+super.info() +"}";
    }
}
