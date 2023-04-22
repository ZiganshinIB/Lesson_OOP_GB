package base;

import seminar2.ExS.homework.base.UserConsole;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;


/**
 * Класс пользовательского интерфейса предусмотрен:
 *  хранение множество типов элементов (различных видов) и список для хранения этих элементов
 *  После создание экземпляра класса необходимо запустить функцию start
 * @param <T> Тип хранимых элементов
 */
public abstract class UserItemConsole<T> extends BaseConsole{

    /**
     * Типы для хранения
     */
    protected HashSet<String> setElements;
    /**
     * Список элементов которые храним
     */
    protected List<T> itemList;

    /**
     * Запускает наш командер
     */

    /**
     * Инициализация типов элементов
     */
    protected abstract void initTypeItem();

    /**
     * Добавить элемент
     */
    protected abstract void addItem();

    protected UserItemConsole(){
        super();
        setElements = new HashSet<>();
        initTypeItem();
    }

    /**
     * Инициализация списка команд
     */
    @Override
    protected void initCommand() {
        commandList.add("Добавить элемент'");
        commandList.add("Убрать элемент");
        commandList.add("Показать все элементы");
    }


    /**
     * Выполнение команд
     * @param number номер командый
     */
    protected void compel(Integer number){
        switch (number){
            case 0:
                addItem();
                break;
            case 1:
                removeItem();
                break;
            case 2:
                showItems();
                break;
            default:
                System.out.println("Пока ничего не делаю");
                break;
        }
    }

    /**
     * Показать хранимые элементы
     */
    protected void showItems(){
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(i+". "+itemList.get(i));
        }
        System.out.println();
    }


    /**
     * Удалить элемент
     */
    protected void removeItem() {
        System.out.println("Убрать элемент из списка напишите индекс элемента");
        int index = scanner.nextInt();
        itemList.remove(index);
    }

    protected void showItem(T item){
        System.out.println(item);
    }


}
