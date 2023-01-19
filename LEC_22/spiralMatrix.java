import java.util.Scanner;

public class spiralMatrix {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int arr[][], int r, int c) {

        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;

        int totalEle = 0;
        while (totalEle < r * c) {
            for (int j = leftCol; j <= rightCol && totalEle < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalEle++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && totalEle < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalEle++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && totalEle < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalEle++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalEle < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalEle++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & cols : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printArray(matrix);
        System.out.println("The spiral order of the matrix is : ");
        printSpiralOrder(matrix, rows, cols);
        sc.close();
    }
}