package Module_2.Interfaces;

public class Fish implements Swimmable {

    String type;
    int weight;

    public Fish(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }


    @Override
    public void swim() {
        System.out.println("Плавает с рождения");

    }




}