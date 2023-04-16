package seminar2.ExS.homework;

import seminar2.ExS.homework.base.WildAnimal;

import java.util.Date;

public class Wolf extends WildAnimal {
    private Boolean isLeader;

    public Wolf(double height, double weight, String eyeColor, String location, Date dateLocation) {
        super(height, weight, eyeColor, location, dateLocation);
        this.isLeader = false;
    }

    public Wolf(double height, double weight, String eyeColor, String location, Date dateLocation, Boolean isLeader) {
        super(height, weight, eyeColor, location, dateLocation);
        this.isLeader = isLeader;
    }

    public Boolean getLeader() {
        return isLeader;
    }

    @Override
    public void getVoice() {
        System.out.println("Оууу-Воуу-Вооуу");
    }
}
