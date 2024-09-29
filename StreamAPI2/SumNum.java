package Module_2.StreamAPI2;

import java.util.Arrays;
import java.util.List;

public class SumNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Массив чисел: " + numbers);
        System.out.println();
        // Сумма четных чисел
        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма четных чисел: " + sumOfEvens);

        // Сумма не четных чисел
        int sumOfOdds = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма не четных чисел: " + sumOfOdds);
    }
}

