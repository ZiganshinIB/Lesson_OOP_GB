package seminar2.ExS.homework;

import seminar2.ExS.homework.base.PetAnimal;

import java.util.Date;

public class Cat extends PetAnimal {

    private Boolean hasWool;

    public Cat(double height, double weight, String eyeColor, String nickname, String breed, Boolean isVaccinations, String coatColor, String birthdate, Boolean hasWool) {
        super(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate);
        this.hasWool = hasWool;
    }

    public Cat(double height, double weight, String eyeColor, String nickname, String breed, boolean isVaccinations, String coatColor, String birthdate) {
        super(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate);
    }

    @Override
    public void getVoice() {
        System.out.println("Мявк");
    }

    @Override
    public void petting() {
        System.out.println("Ласкай меня");
    }

    public Boolean getHasWool() {
        return hasWool;
    }
}
