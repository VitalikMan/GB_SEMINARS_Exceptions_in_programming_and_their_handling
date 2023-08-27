package Seminar1.HomeWork1;

/* Реализуйте метод, принимающий в качестве аргументов двумерный массив.
 * Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
 * детализировать какие строки со столбцами не требуется. */
public class Task1 {

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };

        int[][] matrix3 = null;


        try {
            System.out.println(checkingMatrix(matrix1));
            System.out.println(checkingMatrix(matrix2));
//            System.out.println(checkingMatrix(matrix3));

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            try {
                System.out.println(checkingMatrix(matrix3));    // вынес в блок finally для демонстрации
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }


    private static String checkingMatrix(int[][] matrix) throws Exception {
        if (matrix == null) {
            throw new NullPointerException("Матрица имеет значение => null");
        }
        for (int[] rows : matrix) {
            if (rows.length != matrix.length) {
                throw new RuntimeException("Матрица не квадратная");
            }
        }
        return "Матрица квадратная";
    }

}