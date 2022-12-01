import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Count Digit Of A Given Number

        int num, countDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();

        while (num != 0) {
            num /= 10;
            countDigits++;
        }
        System.out.println("The digits of the given number is : " + countDigits);
        sc.close();
    }
}
