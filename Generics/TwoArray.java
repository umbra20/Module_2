package Module_2.Generics;
//TODO  Напишите метод, который принимает два массива одного типа и проверяет,
// содержат ли они одинаковые элементы в одном и том же порядке.

import java.util.Arrays;

public class TwoArray {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 2, 8, 6};
        int[] array2 = new int[]{6, 8, 2, 2, 1};

        System.out.println("Проверка двух массивов на одинаковые элементы в одном и том же порядке.");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

//        boolean arrayEquality = Arrays.equals(array1, array2); // проверка массива на совпадение
//
//        if (arrayEquality) {
//            System.out.println("Оба массива одинаковы");
//        } else {
//            System.out.println("Нет совпадений");
//
//        }

        boolean unorderedEquality = arrayEqualUnordered(array1, array2);
        if (unorderedEquality) {
            System.out.println("Оба массива содержат одинаковые элементы.");
        } else {
            System.out.println("Массивы содержат разные элементы.");
        }

    }

    public static boolean arrayEqualUnordered(int[] arra1, int[] arra2)
    {
        if (arra1.length != arra2.length){
            return false;
        }
        Arrays.sort(arra1);
        Arrays.sort(arra2);
        return Arrays.equals(arra1, arra2);
    }
}

