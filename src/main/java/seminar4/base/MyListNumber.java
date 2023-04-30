package seminar4.base;

public interface MyListNumber<T extends Number> extends MyList, AllSorting{
    /**
     * Получить Максимальное значение массива
     * @return Максимальное значение массива
     */
    T getMax();

    /**
     * Получить Минимальное значение массива
     *
     * @return Получить Минимальное значение массива
     */
    T getMin();

    /**
     * Поиск суммы элементов массива
     * @return Сумма элементов массива
     */
    T getSum();

    /**
     * Поиск произведения элементов массива
     * @return произведения элементов массива
     */
    T getProducts();

}
