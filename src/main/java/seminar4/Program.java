package seminar4;

public class Program {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        myArrayList1.printArray();
        Integer[] integers = new Integer[]{1,3,5,7,8,0,91};
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>(integers);
        myArrayList2.printArray();
    }
}
