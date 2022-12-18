import java.util.Scanner;

public class arrayUsingWhileLoop {

    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);

        // Taking value from the user
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element you want to add in the array");
            int num = sc.nextInt();
            array[i] = num;
        }
        int i = 0;
        System.out.print("[ ");
        while (i < array.length) {
            System.out.print(array[i] + ",");
            i++;
        }
        System.out.print(" ]");
        sc.close();
    }
}