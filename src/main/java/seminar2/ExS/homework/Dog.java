package seminar2.ExS.homework;

import seminar2.ExS.homework.base.ITraining;
import seminar2.ExS.homework.base.PetAnimal;

import java.util.Date;
import java.util.TreeMap;

public class Dog extends PetAnimal implements ITraining {
    private Boolean isTrained;

    public Dog(double height, double weight, String eyeColor, String nickname, String breed, Boolean isVaccinations, String coatColor, Date birthdate) {
        super(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate);
        isTrained = false;
    }


    public Dog(double height, double weight, String eyeColor, String nickname, String breed, Boolean isVaccinations, String coatColor, Date birthdate, Boolean isTrained) {
        super(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate);
        this.isTrained = isTrained;
    }

    @Override
    public void getVoice() {
        System.out.println("Гавки-Гав");
    }

    @Override
    public void petting() {
        System.out.println("Ласки: угу");
        this.isTrained = false;
    }

    @Override
    public void train() {
        System.out.println("Дресируюсь");
        this.isTrained = true;
    }

    public Boolean getTrained() {
        return isTrained;
    }
}
