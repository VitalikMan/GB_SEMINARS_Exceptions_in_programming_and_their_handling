package Seminar2.HomeWork2;

import java.util.Scanner;



public class Task1 {
    /*
    Задание 1:
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(numberFloat(scanner));
        scanner.close();
    }

    public static float numberFloat(Scanner scanner) {

        float floatValue;
        System.out.print("Введите дробное число: ");
        while (true) {
            String input = scanner.next();
            input = input.replace(',', '.');
            try {
                floatValue = Float.parseFloat(input);
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат числа, попробуйте снова.");
            }
        }
        return floatValue;
    }
}
