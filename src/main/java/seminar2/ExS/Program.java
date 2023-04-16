package seminar2.ExS;

import seminar2.ExS.homework.ConsoleZoo;
import seminar2.ExS.homework.base.Console;
import seminar2.ExS.schollers.JuniorSchoolboy;
import seminar2.ExS.schollers.MiddleSchoolboy;
import seminar2.ExS.schollers.SeniorSchoolboy;
import seminar2.ExS.schollers.base.Schoolboy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Schoolboy> schoolboys = new ArrayList<>();
        schoolboys.add(new JuniorSchoolboy("Petr", 1));
        schoolboys.add(new JuniorSchoolboy("Bob", 2));
        schoolboys.add(new MiddleSchoolboy("Tim", 5));
        schoolboys.add(new MiddleSchoolboy("Alex", 7));
        schoolboys.add(new SeniorSchoolboy("Stive", 10));
        schoolboys.add(new SeniorSchoolboy("Petr S.", 11));
        for (var item: schoolboys){
            System.out.println(item);
            showInfo(item);
            System.out.println();
        }
        Console consoleZoo = new ConsoleZoo();

    }

    static void showInfo(Schoolboy schoolboy) {
        schoolboy.study();
        if (schoolboy instanceof JuniorSchoolboy) {
            ((JuniorSchoolboy) schoolboy).game();
            ((JuniorSchoolboy) schoolboy).goExtension();
        }
        if (schoolboy instanceof MiddleSchoolboy) {
            ((MiddleSchoolboy) schoolboy).game();
            ((MiddleSchoolboy) schoolboy).smoke();
            ((MiddleSchoolboy) schoolboy).playCard();
        }
        if (schoolboy instanceof SeniorSchoolboy) {
            ((SeniorSchoolboy) schoolboy).studyDrive();
            ((SeniorSchoolboy) schoolboy).visitMilitary();
            ((SeniorSchoolboy) schoolboy).smoke();
        }
    }

}


