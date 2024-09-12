package Module_2.Exception;

import java.util.Scanner;

public class Chetnoe {
    public static void main(String[] args) {
        Chetnoe num = new Chetnoe();
        num.CheckEven();


    }

    void CheckEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.println(number + " - Четное число");

        } else {
            throw new ArithmeticException("Число - " + number + "," + " не четное");
        }

    }
}

