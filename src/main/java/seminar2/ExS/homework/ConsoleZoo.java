package seminar2.ExS.homework;

import seminar2.ExS.homework.base.Animal;
import seminar2.ExS.homework.base.Console;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class ConsoleZoo extends Console {
    private HashSet<String> typeAnimals;
    private Zoo zooPark;

    private void initCommand(){
        commandList.add("Добавлять новых животных в зоопарк");
        commandList.add("Убрать животное из зоопарка");
        commandList.add("Печатать информацию о конкретном животном");
        commandList.add("Печатать информацию о всех животных в зоопарке на данный момент");
        commandList.add("Заставить животное издавать звук");
        commandList.add("заставлять издавать звук всех животных");
    }

    private void initAnimalList(){
        typeAnimals = new HashSet<>();
        typeAnimals.add("Кошка");
        typeAnimals.add("Курица");
        typeAnimals.add("Собака");
        typeAnimals.add("Тигр");
        typeAnimals.add("Волк");
        typeAnimals.add("Аист");
    }

    public ConsoleZoo() {
        super();
        zooPark = new Zoo();
        initCommand();
        initAnimalList();
        start();
    }

    @Override
    protected void compel(int number) {
        switch (number){
            case 0:
                addAnimalInZoo();
                break;
            case 1:
                removeAnimal();
                break;
            case 2:
                infoAnimal();
                break;
            case 3:
                infoAll();
                break;
            case 4:
                voice();
                break;
            case 5:
                voiceAll();
                break;
            default:
                System.out.println("Пока ничего не делаю");
                break;
        }
    }

    private void voiceAll() {
        zooPark.getVoice();
    }

    private void voice() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        zooPark.get(index).getVoice();
    }

    private void infoAll() {
        zooPark.infoAll();
    }

    private void infoAnimal() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        System.out.println(zooPark.get(index));
    }

    private void removeAnimal() {
        System.out.println("Убрать жифотное из списка напишите индекс животного");
        int index = scanner.nextInt();
        zooPark.remove(index);
    }

    private void addAnimalInZoo() {
        System.out.println("Выбери животное (напиши словами как указано) если вы передумали напиште не надо: ");
        for (var element: typeAnimals) {
            System.out.println(element);
        }
        String typeName = scanner.next();
        while (!typeAnimals.contains(typeName)){
            System.out.println("Вы ошиблись нет такого жифотного :(");
            System.out.println("Выбери животное (напиши словами как указано) если вы передумали напиште не надо: ");
            for (var element: typeAnimals) {
                System.out.println(element);
            }
            typeName = scanner.next();
        }

        System.out.println("Введите рост животного : ");
        double height = scanner.nextDouble();
        System.out.println("Введите вес животного : ");
        double weight = scanner.nextDouble();
        System.out.println("Введите цвет глаз : ");
        String eyeColor = scanner.next();
        if (typeName.equals("Кошка") ||
                typeName.equals("Собака")){

            System.out.println("Введите кличку: ");
            String nickname = scanner.next();
            System.out.println("Введите порода: ");
            String breed = scanner.next();
            System.out.println("Ваксинирован(Y-да, иначе-нет): ");
            String f = scanner.next();
            boolean isVaccinations = f.toLowerCase().equals("y");
            System.out.println("Введите цвет шерсти: ");
            String coatColor = scanner.next();
            System.out.println("Введите дата рождение: ");
            String birthdate = scanner.next();
            if (typeName.equals("Кошка")){
                System.out.println("Имеет шерст (Y-да, иначе нет): ");
                String f1 = scanner.next();
                boolean hasWool = f1.toLowerCase().equals("y");
                zooPark.add(new Cat(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate, hasWool));
            }
            if (typeName.equals("Собака")){
                System.out.println("Наличие дрессировки (Y-да, иначе-нет): ");
                boolean isTrained = scanner.next().toLowerCase().equals("y");
                zooPark.add(new Cat(height, weight, eyeColor, nickname, breed, isVaccinations, coatColor, birthdate, isTrained));
            }
        }
        if (typeName.equals("Курица") ||
                typeName.equals("Аист")){

            System.out.println("Введите высоту полета : ");
            double flyingHeight = scanner.nextDouble();
            if(typeName.equals("Курица")){
                zooPark.add(new Chicken(height, weight, eyeColor,flyingHeight));
            }
            if(typeName.equals("Аист")){
                zooPark.add(new Stork(height, weight, eyeColor,flyingHeight));
            }
        }
        if (typeName.equals("Волк") ||
                typeName.equals("Тигр")){

            System.out.println("Введите местопложение : ");
            String location = scanner.next();
            System.out.println("Введите дату нахождения : ");
            String dateLocation = scanner.next();
            if(typeName.equals("Волк")){
                System.out.println("Лидер? (Y-да, иначе-нет): ");
                boolean isTrained = scanner.next().toLowerCase().equals("y");
                zooPark.add(new Wolf(height, weight, eyeColor, location, dateLocation, isTrained));
            }
            if(typeName.equals("Тигр")){
                zooPark.add(new Tiger(height, weight, eyeColor, location, dateLocation));
            }
        }

    }


}
