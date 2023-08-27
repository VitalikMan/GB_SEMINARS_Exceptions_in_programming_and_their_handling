package Seminar1.HomeWork1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


/*
Дан класс
https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/RandomExceptionsClass.java

Запустите код, с помощью анализа стектрейса найдите и по возможности исправьте ошибки,
добейтесь корректного выполнения программы.
 */

public class RandomExceptionsClass {
    public static void main(String[] args) {
        try {
            ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
            int a = 10, b = 0;
            int div = callMethod2(a, b);
            callMethod3(stringArraysList);
            System.out.println(div);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено!");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }

    private static void callMethod6() {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6();
        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6();
        try (FileInputStream fis = new FileInputStream("1.txt")) {
            fis.read();

            if (fis.available() > 0) throw new RuntimeException();
            int num = callMethod4("124O");
            return a / b;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            return 0;
        }
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6();
        String[] strings = new String[5];
        for (int i = 1; i <= strings.length; i++) {
            strings[i - 1] = s;
        }
    }
}

