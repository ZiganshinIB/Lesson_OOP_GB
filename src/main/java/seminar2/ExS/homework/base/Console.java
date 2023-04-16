package seminar2.ExS.homework.base;

import seminar2.ExS.homework.base.UserConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public abstract class Console {
    protected Scanner scanner;
    protected List<String> commandList;

    public Console() {
        this.scanner = new Scanner(System.in);
        commandList = new ArrayList<>();
    }

    protected void start(){
        System.out.println("Выбирете команду из списка (если хотите выйти введите -1):");
        for (int i = 0; i < commandList.size(); i++) {
            System.out.println("\t"+i + ") "+commandList.get(i));
        }
        int numberCommand = scanner.nextInt();
        while (numberCommand != -1){
            compel(numberCommand);
            System.out.println("Выбирете команду из списка (если хотите выйти введите -1):");
            for (int i = 0; i < commandList.size(); i++) {
                System.out.println("\t"+i + ") "+commandList.get(i));
            }
            numberCommand = scanner.nextInt();
        }
    }

    protected abstract void compel(int number);

}
