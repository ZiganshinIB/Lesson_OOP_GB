package seminar2.ExS.homework;

import seminar2.ExS.homework.base.Bird;

public class Chicken extends Bird{
    public Chicken(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    public Chicken(double height, double weight, String eyeColor, double flyingHeight) {
        super(height,weight, eyeColor,  flyingHeight);
    }

    @Override
    public void getVoice() {
        System.out.println("квок-квок");
    }
}
