import java.util.*;

public class transpose {

    // 1st method
    static int[][] transposeOfMatrix(int arr[][], int r, int c) {
        int ans[][] = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        return ans;
    }

    // 2nd method with no extra arr
    static void findTransposeWithNoArr(int arr[][], int r, int c) {

        /*
         * It is only applicable for square matrixes
         */

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        System.out.println("Enter " + (rows * cols) + " elements");
        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        printMatrix(matrix);
        // int ans[][] = transposeOfMatrix(matrix, rows, cols);
        System.out.println("The transpose of the matrix is : ");
        // printMatrix(ans);
        findTransposeWithNoArr(matrix, rows, cols);
        printMatrix(matrix);
        sc.close();
    }
}