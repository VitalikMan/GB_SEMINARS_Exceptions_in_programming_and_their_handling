package Seminar2.HomeWork2;

public class Task3 {
    /*
    Задание 3:
    Дан следующий код, исправьте его там, где требуется:
    https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
    */

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {    // опустил данное исключение вниз, т.к. является базовым классом для всех исключений
            System.out.println("Что-то пошло не так...");
        }
    }

    // Убрал "throws FileNotFoundException" из метода, т.к. внутри этого метода, не генерирует это исключение
    public static void printSum(Integer a, Integer b) {  // throws FileNotFoundException {
        System.out.println(a + b);
    }
}
