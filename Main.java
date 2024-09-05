package Module_2.Les_2;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Eagle(240);
        bird1.makeSound();
        bird1.fly();
        System.out.println("Летят со скоростью " + bird1.flySpeed + "км/ч");
        System.out.println("________________________________________________________________________");
        System.out.println();
        Bird bird2 = new Module_2.Les_2.Hawk(60);
        bird2.makeSound();
        bird2.fly();
        System.out.println("Летят со скоростью " + bird2.flySpeed + "км/ч");

    }
}
