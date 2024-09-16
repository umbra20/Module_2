package Module_2.Map;

import Module_2.Les_2.Hawk;

import java.util.HashMap;
import java.util.Set;

//TODO  Создайте HashMap c ключами Integer, значениями – String. Напишите метод,
// который возвращает набор ключей, содержащихся в этой карте.
public class HashMp {
    public static void main(String[] args) {
        System.out.println("Метод который возвращает набор ключей");
        System.out.println();
        HashMap<Integer, String> intToStringMap = new HashMap<>();
        intToStringMap.put(0, "00");
        intToStringMap.put(1, "11");
        intToStringMap.put(2, "22");
        intToStringMap.put(3, "33");
        System.out.println("Набор ключей " + intToStringMap);
        System.out.println();
        System.out.println("Вывод: " + getKeysSet(intToStringMap));

    }

    static <K, V> Set<K> getKeysSet(HashMap<K, V> map) {
        return map.keySet();
    }
}
