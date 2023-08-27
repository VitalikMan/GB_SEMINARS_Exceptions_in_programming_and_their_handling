package Seminar2.HomeWork2;

import java.util.Scanner;

public class Task4 {
    /*
    Задание 3:
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(emptyString(scanner));
        scanner.close();
    }

    public static String emptyString(Scanner scanner) {
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();

        // Если строка пустая, выбрасываем исключение
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
        return input;
    }
}
