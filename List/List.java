package Module_2.List;
//TODO Создайте ArrayList, содержащий разные цвета,
// тип элемента этого динамического массива – String.
// Напишите метод для поиска элемента в списке , содержащем эти цвета.
// На вход метод принимает параметр поиска. Например, если список содержит
// «red», «blue», «green» и в аргументы метода передать «red», то метод должен
// вернуть true, символизируя то, что этот цвет содержится в списке.
import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        System.out.println("Поиск элемента в списке");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        System.out.println(checkColor(colors, "red"));
    }
    public static boolean checkColor(ArrayList<String> list, String color){
                return list.contains(color);
    }
}
