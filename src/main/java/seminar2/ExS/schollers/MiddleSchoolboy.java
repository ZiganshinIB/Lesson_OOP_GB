package seminar2.ExS.schollers;

import seminar2.ExS.schollers.base.IGamer;
import seminar2.ExS.schollers.base.ISmoker;
import seminar2.ExS.schollers.base.Schoolboy;

public class MiddleSchoolboy extends Schoolboy implements IGamer, ISmoker {

    public MiddleSchoolboy(String fullName, Integer classNumber) {
        super(fullName, classNumber);
    }

    public void playCard(){
        System.out.println("Я играю в мафию");
    }
    @Override
    public void game() {
        System.out.println("Я играю в Minecraft");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }
}
