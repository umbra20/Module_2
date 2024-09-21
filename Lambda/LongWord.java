package Module_2.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LongWord {
    public static void main(String[] args) {
        String s = "Сегодня замечательная погода в моей жизни";
        String longets = Arrays.stream(s.split(" ")).
                max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longets);
    }

}



