package seminar1.homework;

import seminar1.homework.base.Hygiene;

public class Mask extends Hygiene {
    public Mask(String name, double price, int count, String unit, Integer countInPackage) {
        super(name, price, count, unit, countInPackage);
    }

    @Override
    public String toString() {
        return "Mask{"+ super.info() +"}";
    }
}

