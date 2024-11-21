import java.util.Arrays;

/**
 * This class provides basic matrix operations including matrix multiplication 
 * and calculating the sum of maximum and minimum elements from specific rows.
 */
public class MatrixOperations {

    /**
     * The main method where matrix operations are performed.
     * It initializes two matrices, multiplies them, and calculates the sum of
     * the maximum elements in even-indexed rows and the minimum elements in odd-indexed rows.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Ініціалізація матриць
            long[][] A = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10},
                {3, 2, 1, 9}
            };
            
            long[][] B = {
                {9, 8, 7, 8},
                {6, 5, 4, 9},
                {3, 2, 1, 9},
                {5, 6, 7, 8}
            };
            
            // Перевірка, чи можна виконати матричний добуток
            if (A[0].length != B.length) {
                throw new IllegalArgumentException("Кількість стовпців матриці A повинна дорівнювати кількості рядків матриці B.");
            }
            
            // Множення матриць A і B
            long[][] C = multiplyMatrices(A, B);
            
            // Виведення результату множення
            System.out.println("Результат множення матриць A і B (матриця C):");
            printMatrix(C);
            
            // Обчислення суми найбільших і найменших елементів
            long sum = calculateSum(C);
            System.out.println("Сума найбільших елементів в парних рядках і найменших в непарних рядках: " + sum);
            
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

    /**
     * Multiplies two matrices A and B and returns the result as a new matrix.
     * 
     * @param A the first matrix
     * @param B the second matrix
     * @return the resulting matrix after multiplying A and B
     */
    public static long[][] multiplyMatrices(long[][] A, long[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        long[][] result = new long[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    /**
     * Calculates the sum of maximum elements in even-indexed rows and minimum elements in odd-indexed rows.
     * 
     * @param matrix the matrix to calculate the sum from
     * @return the sum of maximum elements in even rows and minimum elements in odd rows
     */
    public static long calculateSum(long[][] matrix) {
        long sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            long extremeValue = matrix[i][0];

            // Знайти найбільший елемент в парних рядках
            if (i % 2 == 0) {
                for (long value : matrix[i]) {
                    if (value > extremeValue) {
                        extremeValue = value;
                    }
                }
            } 
            // Знайти найменший елемент в непарних рядках
            else {
                for (long value : matrix[i]) {
                    if (value < extremeValue) {
                        extremeValue = value;
                    }
                }
            }

            sum += extremeValue;
        }

        return sum;
    }

    /**
     * Prints the matrix to the console in a readable format.
     * 
     * @param matrix the matrix to be printed
     */
    public static void printMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
