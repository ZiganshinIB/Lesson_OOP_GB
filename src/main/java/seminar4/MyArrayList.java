package seminar4;

import seminar4.base.MyListNumber;

import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList <T extends Number> extends MyListNumber {
    private T[] items;
    private int size;
    private static int secretCount = 100;
    private static double percentDown = .85;

    public MyArrayList() {
        items = (T[]) new Number[secretCount];
        System.out.println(items.length);
        size = 0;
    }

    /**
     * Создать Список с массивам
     * @param itemsArray массив
     */
    public MyArrayList(T[] itemsArray) {
        if((int)(secretCount*percentDown) <=  (itemsArray.length)){
            secretCount = (int) (items.length / percentDown);
            System.out.println(secretCount);
            items = (T[]) new Number[secretCount];
            System.out.println(items.length);
        }else{
            items = (T[]) new Number[secretCount];
            System.out.println(items.length);
        }
        size = itemsArray.length;
        for (int i = 0; i < size; i++) {
            items[i] = itemsArray[i];
        }
    }


    /**
     * Пузырковая сортировка
     */
    @Override
    public void bubbleSorting() {

    }

    /**
     * Получить Максимальное значение массива
     *
     * @return Максимальное значение массива
     */
    @Override
    public T getMax() {
        if (items[0] instanceof Double) return (T) getMaxDouble();
        if (items[0] instanceof Integer) return (T) getMaxInteger();
        if (items[0] instanceof Long) return (T) getMaxLong();
        if (items[0] instanceof Short) return (T) getMaxShort();
        if (items[0] instanceof Float) return (T) getMaxFloat();
        if (items[0] instanceof Byte) return (T) getMaxByte();
        // Крайний случай
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.hashCode() < (this.items[i].hashCode())) max = items[i];
        }
        return max;
    }

    private Byte getMaxByte() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.byteValue() < (this.items[i].byteValue())) max = items[i];
        }
        return max.byteValue();
    }

    private Float getMaxFloat() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.floatValue() < (this.items[i].floatValue())) max = items[i];
        }
        return max.floatValue();
    }

    private Short getMaxShort() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.shortValue() < (this.items[i].shortValue())) max = items[i];
        }
        return max.shortValue();
    }

    private Long getMaxLong() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.longValue() < (this.items[i].longValue())) max = items[i];
        }
        return max.longValue();
    }

    private Integer getMaxInteger() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.intValue() < (this.items[i].intValue())) max = items[i];
        }
        return max.intValue();
    }

    private Double getMaxDouble() {
        var max = items[0];
        for (int i = 1; i < size ; i++) {
            if (max.doubleValue() < (this.items[i].doubleValue())) max = items[i];
        }
        return max.doubleValue();
    }


    /**
     * Получить Минимальное значение массива
     *
     * @return Получить Минимальное значение массива
     */
    @Override
    public T getMin() {
        if (items[0] instanceof Double) return (T) getMinDouble();
        if (items[0] instanceof Integer) return (T) getMinInteger();
        if (items[0] instanceof Long) return (T) getMinLong();
        if (items[0] instanceof Short) return (T) getMinShort();
        if (items[0] instanceof Float) return (T) getMinFloat();
        if (items[0] instanceof Byte) return (T) getMinByte();
        // Крайний случай
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.hashCode() > (this.items[i].hashCode())) min = items[i];
        }
        return min;
    }

    private Byte getMinByte() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.byteValue() > (this.items[i].byteValue())) min = items[i];
        }
        return min.byteValue();
    }


    private Float getMinFloat() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.floatValue() > (this.items[i].floatValue())) min = items[i];
        }
        return min.floatValue();
    }

    private Short getMinShort() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.shortValue() > (this.items[i].shortValue())) min = items[i];
        }
        return min.shortValue();
    }

    private Integer getMinInteger() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.intValue() > (this.items[i].intValue())) min = items[i];
        }
        return min.intValue();
    }

    private Double getMinDouble() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.doubleValue() > (this.items[i].doubleValue())) min = items[i];
        }
        return min.doubleValue();
    }

    private Long getMinLong() {
        var min = items[0];
        for (int i = 1; i < size ; i++) {
            if (min.longValue() > (this.items[i].longValue())) min = items[i];
        }
        return min.longValue();
    }


    /**
     * Поиск суммы элементов массива
     *
     * @return Сумма элементов массива
     */
    @Override
    public T getSum() {
        Double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum= sum + items[i].doubleValue();
        }
        return (T) sum;
    }

    /**
     * Поиск произведения элементов массива
     *
     * @return произведения элементов массива
     */
    @Override
    public T getProducts() {
        return null;
    }

    /**
     * Добавление в конец списка массива элементов
     *
     * @param arrayItem Массив элементов
     */
    @Override
    public void append(Number[] arrayItem) {

    }

    /**
     * Добавление в конец списка элемент
     *
     * @param item элемент
     */
    @Override
    public void append(Number item) {

    }

    /**
     * Добавление в конец списка массива элементов
     *
     * @param arrayItem Массив элементов
     */
    @Override
    public void append(Object[] arrayItem) {

    }

    /**
     * Добавление в конец списка элемент
     *
     * @param item элемент
     */
    @Override
    public void append(Object item) {

    }

    /**
     * Удаление элемента по индексу
     *
     * @param index индекс
     * @return Удаленный элемент
     */
    @Override
    public T removeOfIndex(int index) {
        return null;
    }

    /**
     * Удаление всех элементов с заданным значением
     *
     * @param item заданное значение
     */
    @Override
    public void removeAllItem(Object item) {

    }

    /**
     * Удаление всех элементов с заданным значением
     *
     * @param item заданное значение
     */
    @Override
    public void removeAllItem(Number item) {

    }

    /**
     * Удаление всех элементов
     */
    @Override
    public void removeAll() {

    }

    /**
     * Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     *
     * @param item Заданный элемент
     * @return Индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     */
    @Override
    public int getIndex(Object item) {
        return 0;
    }

    /**
     * Проверка наличия элемента в массиве
     *
     * @param item Элемент
     * @return true, если элемент в массиве есть, false – нет.
     */
    @Override
    public boolean isContain(Object item) {
        return false;
    }

    /**
     * Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     *
     * @param item Заданный элемент
     * @return Индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     */
    @Override
    public int getIndex(Number item) {
        return 0;
    }

    /**
     * Проверка наличия элемента в массиве
     *
     * @param item Элемент
     * @return true, если элемент в массиве есть, false – нет.
     */
    @Override
    public boolean isContain(Number item) {
        return false;
    }

    /**
     * Получение элемента массива по индексу
     *
     * @param index Индекс
     * @return Элемента массива по индексу
     */
    @Override
    public Number getItem(int index) {
        return null;
    }

    /**
     * Задание значения элементу массива с заданным индексом
     *
     * @param item  Элемент
     * @param index Индекс Массива
     */
    @Override
    public void setItem(Object item, int index) {

    }

    /**
     * Задание значения элементу массива с заданным индексом
     *
     * @param item  Элемент
     * @param index Индекс Массива
     */
    @Override
    public void setItem(Number item, int index) {

    }

    /**
     * Печать массива на экран
     */
    @Override
    public void printArray() {

    }

    /**
     * Длинна массива
     *
     * @return Длинна массива
     */
    @Override
    public int getCountItems() {
        return 0;
    }

    /**
     * Сортировка простыми вставками
     */
    @Override
    public void simpleInsertSorting() {

    }

    /**
     * Сортировка простым выбором
     */
    @Override
    public void simpleSelectionSorting() {

    }
}
