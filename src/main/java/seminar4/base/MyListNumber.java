package seminar4.base;

public abstract class MyListNumber<T extends Number> implements MyList, AllSorting {
    /**
     * Получить Максимальное значение массива
     * @return Максимальное значение массива
     */
    public abstract T getMax();

    /**
     * Получить Минимальное значение массива
     *
     * @return Получить Минимальное значение массива
     */
    public abstract T getMin();

    /**
     * Поиск суммы элементов массива
     * @return Сумма элементов массива
     */
    public abstract T getSum();

    /**
     * Поиск произведения элементов массива
     * @return произведения элементов массива
     */
    public abstract T getProducts();
    /**
     * Добавление в конец списка массива элементов
     * @param arrayItem Массив элементов
     */
    public abstract void append(T[] arrayItem);

    /**
     * Добавление в конец списка элемент
     * @param item элемент
     */
    public abstract void append(T item);

    /**
     * Удаление элемента по индексу
     * @param index индекс
     * @return  Удаленный элемент
     */
    public abstract T removeOfIndex(int index);

    /**
     * Удаление всех элементов с заданным значением
     * @param item заданное значение
     */
    public abstract void removeAllItem(T item);
    /**
     * Удаление всех элементов
     */
    public abstract void removeAll();

    /**
     * Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     * @param item Заданный элемент
     * @return Индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
     */
    public abstract int getIndex(T item);

    /**
     * Проверка наличия элемента в массиве
     * @param item Элемент
     * @return true, если элемент в массиве есть, false – нет.
     */
    public abstract boolean isContain(T item);

    /**
     * Получение элемента массива по индексу
     * @param index Индекс
     * @return Элемента массива по индексу
     */
    public abstract T getItem(int index);

    /**
     * Задание значения элементу массива с заданным индексом
     * @param item Элемент
     * @param index Индекс Массива
     */
    public abstract void setItem(T item, int index);

    /**
     *  Печать массива на экран
     */
    public abstract void printArray();

    /**
     * Длинна массива
     * @return Длинна массива
     */
    public abstract int getCountItems();

}
