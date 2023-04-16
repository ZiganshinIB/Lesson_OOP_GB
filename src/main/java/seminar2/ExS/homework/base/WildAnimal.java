package seminar2.ExS.homework.base;

import java.util.Date;

public abstract class WildAnimal extends Animal{
    private String location;
    private String dateLocation;

    public WildAnimal(double height, double weight, String eyeColor, String location, String dateLocation) {
        super(height, weight, eyeColor);
        this.location = location;
        this.dateLocation = dateLocation;
    }

}
