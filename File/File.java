package Module_2.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class File {
    private static final String OUTPUT_FILE_NAME = "D://myFile/output.txt";
    private static final String FIRST_MESSAGE = "Введите данные для записи \n";
    private static final String ADD_MESSAGE = "Введите что-нибудь еще (Для завершение введите -> 0) \n";
    private static final String FINISH_MESSAGE = "Файл создан \n";

    public static void main(String[] args) {
        boolean programFinished = false;
        String resultText = "";
        System.out.println(FIRST_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        while (!programFinished) {

            try {
                String nextLine = scanner.nextLine();
                if (nextLine.equals("0")) {
                    writeToFile(resultText);
                    System.out.println(FINISH_MESSAGE);
                    programFinished = true;

                } else {
                    resultText += nextLine;
                    System.out.println(ADD_MESSAGE);

                }
                resultText += "\n";
            } catch (NoSuchElementException ignored) {

            }

        }

    }

    public static void writeToFile(String string) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME, true));
            writer.append(string);
            writer.close();

        } catch (IOException ignored) {
        }
    }
}


