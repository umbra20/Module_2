package Module_2.Lambda;

import java.beans.Expression;
import java.util.Arrays;

//TODO Напишите программу, реализующую лямбда-выражение для
// вычисления суммы всех четных элементов списка.
public class SumChet {
    public static void main(String[] args) {

        int[] array = {5, 6, 8, 10, 22, 11, 12, 66};
        Sum sum = (x) -> x % 2 ==0;
        System.out.println("Сумма всех четных чисел: " + "\n" + Arrays.toString(array));
        System.out.println();
        System.out.println("Итого: " + sumOfEven(array, sum));
    }

    public static int sumOfEven(int[] array, Sum exp) {
        int result = 0;
        for (int element : array) {
            if (exp.isSum(element)) {
                result += element;
            }
        }
        return result;
    }
}

interface Sum {
    boolean isSum(int a);
}