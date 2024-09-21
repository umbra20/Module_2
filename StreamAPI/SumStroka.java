package Module_2.StreamAPI;
//TODO Создайте список типа String, например, названия пищевых
// продуктов. Напишите программу для подсчета количества строк в
// списке, начинающихся с определенной буквы, с использованием потоков.

import java.util.Arrays;
import java.util.List;

public class SumStroka {
    public static void main(String[] args) {

        List<String> stroka = Arrays.asList("Молоко", "Хлеб", "Шоколад", "Халва", "Творог");
        System.out.println("Количество строк, начинающихся с: " + stroka);

        char startLetter = 'Х';
        // Подсчет кол-во строк, начинающихся с определенной буквы
        long str = stroka.stream()
                .filter(s -> s.startsWith(String.valueOf(startLetter)))
                .count();
        System.out.println("\n Количество строк, начинающихся с '"
                + startLetter + "': " + str);
    }
}