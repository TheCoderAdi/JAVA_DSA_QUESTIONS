import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Print the first multiple of 7 and 5
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number you want to check");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("The first multiple in the given range is : " + i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("There is no number in the given range");
        }
        sc.close();
    }
}
