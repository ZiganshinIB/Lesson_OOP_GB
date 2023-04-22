package seminar3.figure;

import seminar3.figure.base.Figure;
import base.UserItemConsole;

public class Commander extends UserItemConsole<Figure> {
    private static String STOP_ADD_ITEM_IN_LIST = "Пусто";


    public Commander(){
        super();
    }

    @Override
    protected void initCommand(){
        commandList.add("Добавить фигуру");
        commandList.add("Убрать фигуру");
        commandList.add("Показать все фигуры");
    }


    @Override
    protected void initTypeItem() {
        setElements.add("Круг");
        setElements.add("Квадрат");
        setElements.add("Прямоугольник");
        setElements.add("Треугольник");
    }


    @Override
    protected void compel(Integer number) {
        switch (number){
            case 0:
                try {
                    addItem();
                }catch (Exception e){
                    System.out.println("Фигуру не удалось создать и добавить");
                    e.printStackTrace();
                }
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

    protected void showType() {
        System.out.println("Выберите фигуру если вы передумали напиште \"" + STOP_ADD_ITEM_IN_LIST + "\": ");
        for (var element: setElements) {
            System.out.println(element);
        }
    }



    @Override
    protected void addItem() {
        // Input and ...
        showType();
        String typeName = scanner.next();
        while (!setElements.contains(typeName)){
            if(STOP_ADD_ITEM_IN_LIST.equalsIgnoreCase(typeName)) return;
            System.out.println("Вы ошиблись такой фигуры :(" + typeName + ")");
            showType();
            typeName = scanner.next();
        }
        //....

        if (
                typeName.equalsIgnoreCase("Круг")
        ){
            System.out.println("Введите радиус");
            Double r = scanner.nextDouble();
            itemList.add(new Circle(r));
        }
        // Polygon
        if (
                typeName.equalsIgnoreCase("Квадрат") ||
                typeName.equalsIgnoreCase("Треугольник") ||
                typeName.equalsIgnoreCase("Прямоугольник")
        ){

            // Rectangle
            if(
                    typeName.equalsIgnoreCase("Прямоугольник") ||
                    typeName.equalsIgnoreCase("Квадрат")
            ){
                // Square
                if(
                        typeName.equalsIgnoreCase("Квадрат")
                ){
                    System.out.println("Введите сторону квадрата: ");
                    Double side = scanner.nextDouble();
                    itemList.add(new Square(side));
                }
                // Rectangle
                if (
                        typeName.equalsIgnoreCase("Прямоугольник")
                ){
                    System.out.println("Введите ширину прямоугольника: ");
                    Double width = scanner.nextDouble();
                    System.out.println("Введите высоту прямоугольника:");
                    Double height = scanner.nextDouble();
                    itemList.add(new Rectangle(width, height));


                }
            }
            // Triangle
            if(
                    typeName.equalsIgnoreCase("Треугольник")
            ){
                System.out.println("Введите 1 сторону треугольника: ");
                Double side1 = scanner.nextDouble();
                System.out.println("Введите 2 сторону треугольника: ");
                Double side2 = scanner.nextDouble();
                System.out.println("Введите 3 сторону треугольника: ");
                Double side3 = scanner.nextDouble();
                itemList.add(new Triangle(side1, side2, side3));
            }
        }
    }

    @Override
    protected void removeItem() {
        System.out.println("Убрать фигуру из списка напишите индекс фигуры");
        int index = scanner.nextInt();
        itemList.remove(index);
    }

}
