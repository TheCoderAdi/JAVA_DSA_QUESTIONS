import java.util.Scanner;

public class spiralNxN {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] printSpiralOrder(int n) {
        int arr[][] = new int[n][n];

        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while (curr <= n * n) {
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                arr[topRow][j] = curr++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                arr[i][rightCol] = curr++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                arr[bottomRow][j] = curr++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                arr[i][leftCol] = curr++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int ans[][] = printSpiralOrder(n);
        printArray(ans);
        sc.close();
    }
}
