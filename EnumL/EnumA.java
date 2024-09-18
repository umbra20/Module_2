package Module_2.EnumL;

public class EnumA {
    public static int getPosition(char symbol) {
        String symbolStr = String.valueOf(symbol).toUpperCase();
        try {
            EnumAlf element = EnumAlf.valueOf(symbolStr);
            return element.ordinal() + 1; // возвращение порядкового номера
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public enum EnumAlf {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

    }
}