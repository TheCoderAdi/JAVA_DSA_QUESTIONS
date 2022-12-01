import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Reverse the digits of a given number
        int n, reverseNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        while (n > 0) {
            reverseNum = reverseNum * 10 + n % 10;
            n /= 10;
        }
        System.out.println("The reverse of the given number is : " + reverseNum);
        sc.close();
    }
}
