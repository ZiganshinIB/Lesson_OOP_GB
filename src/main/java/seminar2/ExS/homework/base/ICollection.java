package seminar2.ExS.homework.base;

public interface ICollection<T>{
    void add(T element);
    boolean remote(T element);
    T get(int index);
    T remote(int index);
    void infoAll();
}
