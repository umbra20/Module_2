package Module_2.Exception;

public class Stroka {
    public static void main(String[] args) throws Exception {

        System.out.println(CheckDigit("Tes2t"));


    }

    static String CheckDigit(String string) throws Exception {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char symbol : string.toCharArray()) {
            if (Character.isDigit(symbol)) {
                throw new Exception("Ошибка !!! В этой строке имеется цифры");
            }
        }

        return string;
    }
}
