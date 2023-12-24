package gb.java_core;

public class Functions {

    /** Функция подсчёта количества чётных элементов заданного массива
     *
     * @param arr массив
     * @return количество чётных элементов массива
     */
    public static int countEvens(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                count++;
        }
        return count;
    }

    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки
     *
     * @param a число, требующее декорации
     * @return отформатированная строка.
     **/
    public static String decorateEvenArrayElements(int a) {
        return String.format("Количество чётных элементов заданного массива: %d", a);
    }

    /** Функция возвращающая разницу между самым большим и самым маленьким элементами массива
     *
     * @param arr массив
     * @return разница между максимальным и минимальным элементом в массиве
     */
    public static int differenceMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        return max-min;
    }

    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки
     *
     * @param a число, требующее декорации
     * @return отформатированная строка.
     **/
    public static String decorateDifferenceMaxMinArrayElements(int a) {
        return String.format("Разница между самым большим и самым маленьким элементами массива: %d", a);
    }

    /** Функция поиска 2-х соседних нулевых элементов в массиве
     *
     * @param arr массив
     * @return истину или ложь в зависимости от того что в переданном массиве есть два соседних элемента, с нулевым значением
     */
    public static boolean findingTheZeroElementInArray (int[] arr){
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }
        return index != -1 && arr[index] == arr[index + 1];
    }

    /**
     * Функция декорирования типа boolean для вывода в консоль
     * в виде строки
     *
     * @param a тип boolean, требующий декорацию
     * @return отформатированная строка.
     **/
    public static String decorateFindingTheZeroElementInArray(boolean a) {
        String s;
        if (a == true)
            s = "есть в массиве";
        else s = "нет в массиве";
        return String.format("Два соседних элемента с нулевым значением %s", s);
    }
}
