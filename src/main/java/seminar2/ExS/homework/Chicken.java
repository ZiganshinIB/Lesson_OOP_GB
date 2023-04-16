package seminar2.ExS.homework;

import seminar2.ExS.homework.base.Bird;

public class Chicken extends Bird{
    public Chicken(double height, double weight) {
        super(height, weight, "Коричнивый");
    }

    public Chicken(double height, double weight, double flyingHeight) {
        super(height,weight, "Коричнивый", flyingHeight);
    }

    @Override
    public void getVoice() {
        System.out.println("квок-квок");
    }
}
