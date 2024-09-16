package Module_2.Set;
//TODO Создайте два набора, хранящих в себе элементы строкового типа,
// характеризующие цвет чего – либо. Напишите метод для сравнения двух
// наборов и сохранения элементов, которые одинаковы для обоих наборов.

import java.util.HashSet;
import java.util.Set;

public class mouseColors {
    public static void main(String[] args) {
        System.out.println("Сравнения двух наборов элементов.");
        System.out.println();
        Set<String> mouseColor = new HashSet<>();
        mouseColor.add("Серый");
        mouseColor.add("Черный");
        mouseColor.add("Белый");
        System.out.println("Набор первый: " + mouseColor);

        Set<String> dogColors = new HashSet<>();
        dogColors.add("Черный");
        dogColors.add("Белый");
        dogColors.add("Коричневый");
        System.out.println("Набор второй: " + dogColors);

        mouseColor.retainAll(dogColors);
        intersectionOfSets(mouseColor, dogColors);
        System.out.println();
        System.out.println("Итого: --->>> " + mouseColor);
    }

    public static <T> void intersectionOfSets(Set<T> firstSet, Set<T> secondSet) {
        for (T element : firstSet) {
            secondSet.remove(element);
        }
    }
}
