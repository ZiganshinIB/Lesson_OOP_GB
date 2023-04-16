package seminar2.ExS.schollers;

import seminar2.ExS.schollers.base.ISmoker;
import seminar2.ExS.schollers.base.Schoolboy;

public class SeniorSchoolboy extends Schoolboy implements ISmoker {
    public SeniorSchoolboy(String fullName, Integer classNumber) {
        super(fullName, classNumber);
    }

    public void studyDrive(){
        System.out.println("Я хочу водить");
    }
    public void visitMilitary(){
        System.out.println("Боюсь военкома");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }
}
