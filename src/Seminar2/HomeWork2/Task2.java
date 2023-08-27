package Seminar2.HomeWork2;

public class Task2 {
    /*
    Задание 2:
    Если необходимо, исправьте данный код:
    https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
    */

    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // добавил массив для корректной работы кода
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("Деление на ноль запрещено!");
        }
    }

}
