package Module_2.Generics;
//TODO  Напишите метод, который принимает два массива одного типа и проверяет,
// содержат ли они одинаковые элементы в одном и том же порядке.

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.compare;

public class TwoArray {

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 2, 8, 6};
        Integer[] array2 = {1, 2, 2, 8, 6};
        System.out.println("Проверка двух массива, на совпадение.");
        System.out.println(compare(array1, array2));

    }

    private static <T> boolean compare(T[] a, T[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        System.out.println("Два массива, одинаковы");
        return true;
    }
}

/*
        System.out.println("Проверка двух массивов на одинаковые " +
                "элементы в одном и том же порядке.");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        boolean unorderedEquality = arrayEqualUnordered(array1, array2);
        if (unorderedEquality) {
            System.out.println("Оба массива содержат одинаковые элементы.");
        } else {
            System.out.println("Массивы содержат разные элементы.");
        }

    }

    public static boolean arrayEqualUnordered(int[] arra1, int[] arra2) {
        if (arra1.length != arra2.length) {
            return false;
        }
        Arrays.sort(arra1);
        Arrays.sort(arra2);
        return Arrays.equals(arra1, arra2);
    }
}

*/