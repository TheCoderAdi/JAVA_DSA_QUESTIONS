import java.util.Scanner;

public class matrixAddition {
    static void add(int arr[][], int r, int c, int arr1[][], int r1, int c1) {
        int sum[][] = new int[r][c];
        if (r == r1 && c == c1) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = arr[i][j] + arr1[i][j];
                }
            }
            printArray(sum);
        } else {
            System.out.println("Wrong input-Addition not possible");
        }
    }

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows you want : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the columns you want : ");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        System.out.println("Enter " + (r1 * c1) + " elements : ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter the number you want in the array : ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the second array rows you want : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the second array columns you want : ");
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter " + (r2 * c2) + " elements : ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter the number you want in the array : ");
                arr2[i][j] = sc.nextInt();
            }
        }
        add(arr1, r1, c1, arr2, r2, c2);

        sc.close();
    }
}
