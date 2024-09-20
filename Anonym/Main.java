package Module_2.Anonym;


public class Main {

    public static void main(String[] args) {
        Printable textOne;
        textOne = () -> "Hello World";
        System.out.println(textOne.Print().toUpperCase());
        Printable textTwo;
        textTwo = () -> "Examination";
        System.out.println(textTwo.Print().toUpperCase());
    }

}

