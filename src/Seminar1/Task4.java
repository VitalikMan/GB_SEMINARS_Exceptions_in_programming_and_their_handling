package Seminar1;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {5, 4, 3, 2};
//        int[] ints2 = null;

//        joinArray(ints1, ints2);
        System.out.println(Arrays.toString(joinArray(ints1, ints2)));

    }

    public static int[] joinArray(int[] arr1, int[] arr2) {

        try {
            if (arr1 == null || arr2 == null) {
                throw new NullPointerException();
            }
            if (arr1.length != arr2.length) {
                throw new IllegalAccessException();
            }
        } catch (NullPointerException e) {
//            e.printStackTrace();
            System.out.println("Null pointer - program ended");
            return  null;

        } catch (IllegalAccessException e) {
//            e.printStackTrace();
            System.out.println("Массивы не равны");
        }

        int minArrayLen = Math.min(arr1.length, arr2.length);
        int[] result = new int[minArrayLen];
        for (int i = 0; i < minArrayLen; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }

}
