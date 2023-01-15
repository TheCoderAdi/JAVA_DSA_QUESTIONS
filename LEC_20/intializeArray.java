import java.util.Scanner;

public class intializeArray {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int twoDArray[][] = new int[2][2];// One way
        // int arrayTwoD[][] = { { 1, 2, 3 }, { 1, 2, 3 } };// another way
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows you want : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns you want : ");
        int c = sc.nextInt();
        System.out.println("Enter " + (r * c) + " elements : ");

        int twoDArray[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the number you want in the array : ");
                twoDArray[i][j] = sc.nextInt();
            }
        }
        printArray(twoDArray);
        sc.close();
    }
}
