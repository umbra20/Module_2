package Module_2.Generics;

import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 4, 2, 8, 6};
        int[] array2 = new int[]{1, 2, 2, 8, 6};

       System.out.println("Проверка двух массивов на одинаковые элементы.");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();
        boolean arrayEquality = Arrays.equals(array1, array2); // проверка равенство массива
        if (arrayEquality) {
            System.out.println("Оба массива одинаковы");
        } else {
            System.out.println("Нет совподений");
        }
    }
}


