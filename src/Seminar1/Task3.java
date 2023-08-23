package Seminar1;

public class Task3 {

    public static void main(String[] args) {

        Integer[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        checkArray(ints);
    }

    public static void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == null) {
                    throw new RuntimeException("Встретили null по индексу " + arr[i] + ".");
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
