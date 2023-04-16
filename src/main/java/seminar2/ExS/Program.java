package seminar2.ExS;

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
            System.out.println("Я " + item.getFullName()+ " ученик " + item.getClassNumber() + " класса");
            showInfo(item);
            System.out.println();
        }

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

/*

Реализовать следующую иерархию школьников:
1. Младшеклассник, реализующий следующие методы:
1.1. Учиться, выводящий на экран фразу "Я люблю учиться"
1.2. Играть, выводящий на экран фразу "Я играю в игрушки"
1.3. Ходить в продлёнку, выводящий на экран фразу "Я хожу в продлёнку"
2. Ученик средней школы, реализующий следующие методы:
2.1. Учиться, выводящий на экран фразу "Я ненавижу учиться"
2.2. Играть, выводящий на экран фразу "Я играю в Minecraft"
2.3. Курить, выводящий на экран фразу "Я начинаю курить"
2.4. Играть в карты, выводящий на экран фразу "Я играю в мафию"
3. Старшеклассник, реализующий следующие методы
3.1. Учиться, выводящий на экран фразу "Я должен учиться"
3.2. Курить, выводящий на экран фразу "Я бросаю курить"
3.3. Посетить военкомат, выводящий на экран фразу "Боюсь военкома"
3.4. Учиться на права, выводящий на экран фразу "Я хочу водить"
-3.5 Играть, выводящий на экран фразу "Я не играю "
В методе main класса Program создать объекты всех школьников, и для каждого объекта вызвать метод, описанный в классе Program и вызывающий все методы переданного школьника

1   _________________________________________________________
+ 1) Интерфейс InterfaceSmoker(smoke), InterfaceGamer(game) |
+ 2) Абстрактный класс Schoolboy (study)
+ 3) РЕализация класса JuniorSchoolboy <- Schoolboy and (InterfaceGamer)  (study, game, goExtension)
+ 4) MiddleSchoolboy <-Schoolboy and (InterfaceGamer, InterfaceSmoker)  (study, game, smoke, playCard )
+ 5) SeniorSchoolboy <- Schoolboy and (InterfaceSmoker) (study, smoke, studyDrive, visitMilitary)
+ 6) Создать класс Program (main, showInfo) вызывающий все методы переданного школ
 */
