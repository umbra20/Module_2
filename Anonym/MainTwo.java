package Module_2.Anonym;


public class MainTwo {
    public static void main(String[] args) {
        System.out.println(process("Начало", " действия.", (a, b) -> a + b));
        System.out.println(process("Продолжение", "!", (a, b) -> a + b));
    }

    public static String process(String a, String b, Concationble<String, String> concationble) {
        return concationble.concat(a, b);
    }
}

@FunctionalInterface
interface Concationble<T, V> {
    String concat(T t, V v);
}
