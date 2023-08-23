package Seminar1;

public class Task1 {

    public static void main(String[] args) {

        int[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        int[] ints = null; // проверка на null
//        int[] ints = { }; // проверка на то, если массив пуст

        int result = findValue(ints, 5);
        System.out.println(result);
    }

    public static int findValue(int[] arr, int value) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }
}
