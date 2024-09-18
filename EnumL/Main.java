import Module_2.EnumL.Gender;
import Module_2.EnumL.Person;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


private static final String MEESSAGE_CHOICE = "Пожалуйста, выберите параметра фильтра: Муж - 1 или жен - 2; 0 - выход";
private static final String MESSAGE_INVALID_INPUT_DATA = "Пожалуйста сдейте правильный выбор";


public static void main(String[] args) {
    List<Person> people = List.of(
            new Person("Иван", 20, Gender.MALE),
            new Person("Света", 20, Gender.FEMALE),
            new Person("Коля", 20, Gender.MALE),
            new Person("Александр", 20, Gender.MALE),
            new Person("Никита", 20, Gender.MALE),
            new Person("Алексей", 20, Gender.MALE),
            new Person("Екатерина", 20, Gender.FEMALE),
            new Person("Елена", 20, Gender.FEMALE),
            new Person("Максим", 20, Gender.MALE),
            new Person("Егор", 20, Gender.MALE)


    );


    Scanner scanner = new Scanner(System.in);
    boolean needStop = false;
    while (!needStop) {
        System.out.println(MEESSAGE_CHOICE);
        String choice = scanner.nextLine();
        switch (choice) {
            case "0" -> needStop = true;
            case "1" -> System.out.println(filterByGender(people, Gender.MALE));
            case "2" -> System.out.println(filterByGender(people, Gender.FEMALE));
            default -> System.out.println(MESSAGE_INVALID_INPUT_DATA);
        }


    }


}

public static List<Person> filterByGender(List<Person> people, Gender gender) {
    return people.stream().filter(p -> p.getGender() == gender).collect(Collectors.toList());
}

