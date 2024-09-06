package Module_2.Interfaces;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Васька ", 12, 45);
        System.out.println("Имя: " + human.name + "|   " + "Возраст: " + human.age + "лет" + "  |   " + " Вес: " + human.weight + "кг");
        human.swim();

        System.out.println("______________________________________________");

        Fish fish = new Fish("Карп ", 300);
        System.out.println("Вид рыбы: + " + fish.type + "|" + " Вес: " + fish.weight + "гр.");
        fish.swim();

        System.out.println("______________________________________________");

        Bird bird = new Bird("Чайка", 3);
        System.out.println("Название птицы " + bird.name + " |" + " Возраст: " + bird.age + "года");
        bird.fly();

    }

}
