package Module_2.Interfaces;

public class Human implements Swimmable{
    String name;
    int age;
    int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println(name + " : учится плавать");
    }
}
