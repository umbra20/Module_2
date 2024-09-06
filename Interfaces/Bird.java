package Module_2.Interfaces;

public class Bird  implements Flyable{
    String name; // Название птицы
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("Умеет летать");
    }
}
