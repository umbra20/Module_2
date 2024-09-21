package Module_2.StreamAPI;

import java.util.ArrayList;
import java.util.List;
//TODO  Создать класс Person с полями name и age. В классе с методом
// main создать список, состоящий не менее, чем из 10 объектов класса
// Person с произвольными данными. Отфильтровать
// и вывести в консоль объекты Person, возраст которых более 30 лет.

public class Main {
    public static void main(String[] args) {
        int a = 30;
        System.out.println("Список имен, тем кому за " + a + " лет");
        System.out.println();
        List<Person> list = new ArrayList<>();
        list.add(new Person("Елена", 22));
        list.add(new Person("Алёна", 30));
        list.add(new Person("Олег", 45));
        list.add(new Person("Андрей", 18));
        list.add(new Person("Алла", 23));
        list.add(new Person("Рудик", 38));
        list.add(new Person("Максим", 39));
        list.add(new Person("Алиса", 43));
        list.add(new Person("Борис", 21));
        list.add(new Person("Анатолий", 29));

        List<Person> filteredPeople = list.stream()
                .filter(person -> person.getAge() > a).toList();

        filteredPeople.forEach(person -> System.out.println(person.getName() + ", " +  person.getAge() + " лет"));

    }
}
