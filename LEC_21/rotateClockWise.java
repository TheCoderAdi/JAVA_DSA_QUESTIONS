import java.util.*;

public class rotateClockWise {

    static void reverseArr(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateArr(int arr[][], int n) {

        /*
         * It is only applicable for square matrixes
         */

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Rotating the array
        for (int i = 0; i < n; i++) {
            reverseArr(arr[i]);
        }

        printMatrix(arr);
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
        System.out.println("The rotate of the matrix is : ");
        rotateArr(matrix, rows);
        sc.close();
    }
}
