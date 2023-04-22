package base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public abstract class BaseConsole implements BaseConsoleMaster{
    protected static final Integer STOP_CODE_COMMAND = -1;
    protected Scanner scanner;

    protected List<String> commandList;

    protected abstract void initCommand();
    protected abstract void compel(Integer number);

    BaseConsole(){
        this.scanner = new Scanner(System.in);
        commandList = new ArrayList<>();
        initCommand();
    }
    @Override
    public void start() {
        System.out.println("Выбирете команду из списка (если хотите выйти введите" + STOP_CODE_COMMAND +"):");
        showCommand();
        int numberCommand = scanner.nextInt();
        while (numberCommand != STOP_CODE_COMMAND){
            compel(numberCommand);
            System.out.println("Выбирете команду из списка (если хотите выйти введите "+ STOP_CODE_COMMAND +"):");
            showCommand();
            numberCommand = scanner.nextInt();
        }
    }

    // Показать все Элементы
    @Override
    public void showCommand() {
        for (int i = 0; i < commandList.size(); i++)
            System.out.println("\t"+ i+". "+commandList.get(i));
    }
}
