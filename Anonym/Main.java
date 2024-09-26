package Module_2.Anonym;

public class Main {
    public static void main(String[] args) {
        Printable firstPrintable = new Printable() {
            public void print() {
                System.out.print("Hello ");
            }
        };
        firstPrintable.print();
        Printable secondPrintable = new Printable() {
            public void print() {
                System.out.println("World");
            }
        };
        secondPrintable.print();
        Printable thirdPrintable = new Printable() {
            public void print() {
                System.out.println("Программа работает.");
            }
        };
        thirdPrintable.print();
    }
}

