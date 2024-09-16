package Module_2.Generics;

import java.util.ArrayList;
import java.util.List;

//TODO  Универсальный метод, чтобы обмениваться позициями
// двух различных элементов в массиве.

public class Switch {
    private static final String EXCEPTION_INVALID_SWITCH_INDEX = "Ошибка!!! Не правльный индекс для обмена: ";

    public static void main(String[] args) {
        System.out.println("Метод обмена позиций двух элементов в массиве");
        ArrayList<Integer> oneArray = new ArrayList<>(List.of(0, 1, 2, 3));
        switchElements(1, 3, oneArray);
        System.out.println(oneArray);
    }

    static <T> void switchElements(int oneSwitchIndex, int twoSwitchIndex, ArrayList<T> list) throws IllegalArgumentException {
        if (oneSwitchIndex >= list.size() || oneSwitchIndex < 0) {
            throw new IllegalArgumentException(EXCEPTION_INVALID_SWITCH_INDEX + oneSwitchIndex);
        }
        if (twoSwitchIndex >= list.size() || twoSwitchIndex < 0) {
            throw new IllegalArgumentException(EXCEPTION_INVALID_SWITCH_INDEX + twoSwitchIndex);
        }
        T tempElement = list.get(oneSwitchIndex);
        list.set(oneSwitchIndex, list.get(twoSwitchIndex));
        list.set(twoSwitchIndex, tempElement);
    }
}

