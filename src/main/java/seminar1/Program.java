package seminar1;

import seminar1.homework.*;
import seminar1.homework.base.Product;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Bread bread = new Bread("Кефирный", 41.0, 100, "шт", "после завтра", "твердый сорт");
        System.out.println(bread);
        Diapers diapers = new Diapers("Before S. Bob", 1410.0, 100, "упк.", 1, true, 28, 3.0, 11.0, "Ежедневный" );
        System.out.println(diapers);
        Eggs eggs = new Eggs("Шалтай Болтай", 75, 100, "упк.", "09.05.23", 10);
        System.out.println(eggs);
        Lemonade lemonade = new Lemonade("Чебурашка со вкусом Апельсина", 55, 100, "бутылок", 1.5);
        System.out.println(lemonade);
        Mask mask = new Mask("Elon", 255, 100, "упк.", 5);
        System.out.println(mask);
        Milk milk = new Milk("Веселая корова", 42, 100, "упк.", 0.8, 3.0, "25.04.23");
        System.out.println(milk);
        Nipple nipple = new Nipple("Тихий сон", 100, 100, "шт", 1, false);
        System.out.println(nipple);
        ToiletPaper toiletPaper = new ToiletPaper("Fun Society", 82, 100,  "упк.", 4,2);
        System.out.println(toiletPaper);
    }
}
