package seminar1.homework;

import seminar1.homework.base.BabyProduct;

public class Nipple extends BabyProduct {
    public Nipple(String name, double price, int count, String unit, Integer minimumAge, Boolean hypoallergenic) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Nipple{"+ super.info()+ "}";
    }
}

