package seminar2.ExS.homework;

import seminar2.ExS.homework.base.WildAnimal;

import java.util.Date;

public class Tiger extends WildAnimal {

    public Tiger(double height, double weight, String eyeColor, String location, Date dateLocation) {
        super(height, weight, eyeColor, location, dateLocation);
    }

    @Override
    public void getVoice() {
        System.out.println("Р-Р-р-р-ь-ы");
    }

}
