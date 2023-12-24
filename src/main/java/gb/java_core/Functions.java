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
    public static int DifferenceMaxMin(int[] arr){
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
}
