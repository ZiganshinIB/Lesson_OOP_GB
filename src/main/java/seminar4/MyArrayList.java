package seminar4;

import seminar4.base.MyListNumber;

public class MyArrayList <T extends Number> implements MyListNumber {
    /**
     * Пузырковая сортировка
     */
    @Override
    public void bubbleSorting() {

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
    public Object removeOfIndex(int index) {
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
     * Получение элемента массива по индексу
     *
     * @param index Индекс
     * @return Элемента массива по индексу
     */
    @Override
    public Object getItem(int index) {
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
     * Получить Максимальное значение массива
     *
     * @return Максимальное значение массива
     */
    @Override
    public Number getMax() {
        return null;
    }

    /**
     * Получить Минимальное значение массива
     *
     * @return Получить Минимальное значение массива
     */
    @Override
    public Number getMin() {
        return null;
    }

    /**
     * Поиск суммы элементов массива
     *
     * @return Сумма элементов массива
     */
    @Override
    public Number getSum() {
        return null;
    }

    /**
     * Поиск произведения элементов массива
     *
     * @return произведения элементов массива
     */
    @Override
    public Number getProducts() {
        return null;
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
