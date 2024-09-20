package Module_2.Anonym;



public class MainTwo {
    public static void main(String[] args) {
        Concationble concationble =new Concationble() {
            @Override
            public void ConCat() {
                System.out.println("Действие первое");
            }
        };
concationble.ConCat();
Concationble concationble1 = new Concationble() {
    @Override
    public void ConCat() {
        System.out.println("Действие второе");
    }
};
concationble1.ConCat();
    }
}