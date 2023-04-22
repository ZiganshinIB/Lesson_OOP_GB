package seminar1.homework;

import seminar1.homework.base.BabyProduct;

public class Diapers extends BabyProduct {
    private Integer size;
    private Double minimumWeight;
    private Double maximumWeight;

    private String type;

    public Diapers(String name, double price, int count, String unit, Integer minimumAge, Boolean hypoallergenic, Integer size, Double minimumWeight, Double maximumWeight, String type) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Diapers{" +
                super.info()+
                "size=" + size +
                ", minimumWeight=" + minimumWeight +
                ", maximumWeight=" + maximumWeight +
                ", type='" + type + '\'' +
                '}';
    }
}
