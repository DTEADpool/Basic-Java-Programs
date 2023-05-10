public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        int[][] second = {
                {2, 3, 4},
                {3, 4, 5},
                {4, 5, 6}
        };

        int[][] third = new int[3][3];

        System.out.println("Matrix after multiplication : ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {
                    third[i][j] += first[i][j] * second[i][j];
                }
                System.out.print(third[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
