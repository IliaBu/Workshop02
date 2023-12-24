package gb.java_core;

import java.util.ArrayList;
import java.util.Arrays;
import static gb.java_core.Functions.*;

public class MainMenu extends Menu {

    public MainMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(this::showTask1, "Задача 1"));
        menuItems.add(new MenuItem(this::showTask2, "Задача 2"));
        menuItems.add(new MenuItem(this::showTask3, "Задача 3"));
        menuItems.add(new MenuItem(this::quit, "Выйти"));
    }

    public void quit() {
        ConsoleUi.close();
    }

    public void showTask1() {
        ConsoleUi.print("Написать метод, возвращающий количество чётных элементов массива.\n" +
                "countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0\n", Colors.MAGENTA);
        ConsoleUi.print("Введите длину массива: ", Colors.BLUE);
        int length = ConsoleUi.scanner.nextInt();
        int[] array = new int[length];
        ConsoleUi.print("Введите элементы массива через пробел: ", Colors.BLUE);
        for (int i = 0; i < length; i++) {
            array[i] = ConsoleUi.scanner.nextInt();
        }
        ConsoleUi.println("Массив: " + Arrays.toString(array), Colors.GREEN);
        ConsoleUi.println(decorateEvenArrayElements(countEvens(array)), Colors.YELLOW);
    }

    public void showTask2() {
        ConsoleUi.print("Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.\n", Colors.MAGENTA);
        ConsoleUi.print("Введите длину массива: ", Colors.BLUE);
        int length = ConsoleUi.scanner.nextInt();
        int[] array = new int[length];
        ConsoleUi.print("Введите элементы массива через пробел: ", Colors.BLUE);
        for (int i = 0; i < length; i++) {
            array[i] = ConsoleUi.scanner.nextInt();
        }
        ConsoleUi.println("Массив: " + Arrays.toString(array), Colors.GREEN);
        ConsoleUi.println(decorateDifferenceMaxMinArrayElements(differenceMaxMin(array)), Colors.YELLOW);
    }

    public void showTask3() {
        ConsoleUi.print("Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.\n", Colors.MAGENTA);
        ConsoleUi.print("Введите длину массива: ", Colors.BLUE);
        int length = ConsoleUi.scanner.nextInt();
        int[] array = new int[length];
        ConsoleUi.print("Введите элементы массива через пробел: ", Colors.BLUE);
        for (int i = 0; i < length; i++) {
            array[i] = ConsoleUi.scanner.nextInt();
        }
        ConsoleUi.println("Массив: " + Arrays.toString(array), Colors.GREEN);
        ConsoleUi.println(decorateFindingTheZeroElementInArray(findingTheZeroElementInArray(array)), Colors.YELLOW);
    }
}
