package seminar2.ExS.homework.base;

import javax.swing.text.StyledEditorKit;
import java.util.Date;

public abstract class PetAnimal extends Animal {
    private String nickname;
    private String breed;
    private Boolean isVaccinations;
    private String coatColor;
    private String birthdate;

    public PetAnimal(double height, double weight, String eyeColor, String nickname, String breed, Boolean isVaccinations, String coatColor, String birthdate) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.isVaccinations = isVaccinations;
        this.coatColor = coatColor;
        this.birthdate = birthdate;
    }
    public abstract void petting();

}
