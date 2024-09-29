package Module_2.StreamAPI2;

import java.util.*;
import java.util.stream.Collectors;


public class ElementDel {

    public static void main(String[] args) {
        //  список с дубликатами
        List<Integer> listArray = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 2, 6, 7, 7));
        System.out.println("Массив чисел: " + listArray);
        System.out.println();
        // Создаем новый список из набора, составленного из элементов
        // исходного списка
        List<Integer> listDelArray = listArray.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());

        System.out.println("Итог без повторяющихся чисел: " + listDelArray);
    }
}
