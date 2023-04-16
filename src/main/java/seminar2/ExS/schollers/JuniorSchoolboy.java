package seminar2.ExS.schollers;

import seminar2.ExS.schollers.base.IGamer;
import seminar2.ExS.schollers.base.Schoolboy;

public class JuniorSchoolboy extends Schoolboy implements IGamer {
    public JuniorSchoolboy(String fullName, Integer classNumber) {
        super(fullName, classNumber);
    }

    public void goExtension(){
        System.out.println("Я хожу в продлёнку");
    }
    @Override
    public void game() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }
}
