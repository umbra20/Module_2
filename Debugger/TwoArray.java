package Module_2.Debugger;
//TODO  Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {
        int[] a = new int[]{22, 55, 41, 20, 15, 11, 68, 99};
        System.out.println("Массив чесел: " + Arrays.toString(a));

        // Начинаем с наименьшего в качестве начального предположения
        int largest = Integer.MIN_VALUE;
        for (int number : a) {
            // Пропускаем если не четное
            if (number % 2 == 1) {
                continue;
            }

            // Ищем только четные
            if (number > largest) {
                // обновляем текущее предположение
                largest = number;
            }
        }

        System.out.println("Максимальное четное число из массива = " + largest);
    }
}