package Seminar3;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
*/


import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        Counter counter = new Counter();
        try {
            counter.add();
            System.out.println("Счётчик: " + counter.getCount());
            counter.close();
            System.out.println("Закрыт ли ресурс: " + counter.isClosed());
            counter.add();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Counter c2 = new Counter()) {
            c2.add();
            System.out.println("Счётчик: " + c2.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
