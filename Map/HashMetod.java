package Module_2.Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//TODO  Создайте HashMap c ключами Integer, значениями – String.
// Напишите метод, который возвращает ассоциативный массив, состоящий из элементов
// исходного map, при условии, что туда войдут элементы с длиной строки более 3.
//Т.е. исходный map: [1="Red",2="Green",3="Black"].
//Новый map: [2="Green",3="Black"].
public class HashMetod {
    public static void main(String[] args) {
        System.out.println("Вывод элеметов строки длинной более 3.");
        System.out.println()
        ;
        TreeMap<Integer, String> intToStringMap = new TreeMap<>();
        intToStringMap.put(1, "Red");
        intToStringMap.put(2, "Green");
        intToStringMap.put(3, "Black");
        System.out.println("Имеем: " + intToStringMap);
        System.out.println();
        System.out.println("Итого: " + filterMap(intToStringMap));
    }

    static Map<Integer, String> filterMap(Map<Integer, String> map) {
        return map.entrySet().stream().filter(e -> e.getValue().length() >
                3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

}
