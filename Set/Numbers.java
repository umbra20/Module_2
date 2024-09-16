package Module_2.Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
//TODO Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
// которые больше 15 и являются четными. Остальные элементы
// набора тоже необходимо вывести в консоль, но каждый из них разделив на 2
public class Numbers {
    public static void main(String[] args) {
        System.out.println("Вывод в консоль больше 15 и являются четными.");
        System.out.println();
        TreeSet<Integer> setInt = new TreeSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(15);
        setInt.add(92);
        setInt.add(111);
        setInt.add(34);
        setInt.add(3);
        System.out.println("Элементы целых чисел: " + setInt);
        System.out.println();
        System.out.println("Итого: " + filterSet(setInt));
    }

    static Set<Integer> filterSet(Set<Integer> set) {
        return set.stream().filter(p -> p > 15 && p % 2 == 0).collect(Collectors.toSet());
    }
}
