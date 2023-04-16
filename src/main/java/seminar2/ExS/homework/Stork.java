package seminar2.ExS.homework;

import seminar2.ExS.homework.base.Bird;

public class Stork extends Bird {
    public Stork(double height, double weight, String eyeColor, double flyingHeight) {
        super(height, weight, eyeColor, flyingHeight);
    }

    public Stork(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    @Override
    public void getVoice() {
        System.out.println("Так-так");
    }
}
