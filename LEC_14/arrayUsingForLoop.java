import java.util.Scanner;

public class arrayUsingForLoop {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);
        // Taking value from the user
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element you want to add in the array");
            int num = sc.nextInt();
            array[i] = num;
        }
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(" ]");
        sc.close();
    }
}