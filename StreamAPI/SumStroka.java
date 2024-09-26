import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SumStroka {
    public static void main(String[] args) {

        List<String> stroka = Arrays.asList("Молоко", "Хлеб", "Шоколад", "Халва", "Творог");
        if (stroka.isEmpty()) {
            System.out.println("Список массивов пуст.");
        } else {
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
}
