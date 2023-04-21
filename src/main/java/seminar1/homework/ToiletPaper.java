package seminar1.homework;

import seminar1.homework.base.Hygiene;

public class ToiletPaper extends Hygiene {
    private Integer countLayers;

    public ToiletPaper(String name, double price, int count, String unit, Integer countInPackage, Integer countLayers) {
        super(name, price, count, unit, countInPackage);
        this.countLayers = countLayers;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" +
                super.info()+
                "countLayers=" + countLayers +
                '}';
    }
}
