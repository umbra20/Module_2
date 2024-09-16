package Module_2.List;
//TODO   Создайте LinkedList, содержащий целые числа, т.е. Integer.
// Напишите метод, который меняет местами первый и последний элементы этого списка и
// возвращает этот список в новом виде. Т.е.,
// если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        System.out.println("Обмен местами элемето первого с последнем");
        System.out.println("Элементы: " + numbers);
        System.out.println("Вывод:    " + swapFirstAndLast(numbers));
    }
    public static LinkedList<Integer> swapFirstAndLast(LinkedList<Integer> list){
        if (list.size() > 1){
            int first = list.getFirst();
            list.set(0, list.getLast());
            list.set(list.size() - 1, first);
        }
        return list;
    }
}
