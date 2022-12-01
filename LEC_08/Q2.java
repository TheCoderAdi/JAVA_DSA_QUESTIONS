import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // Find the sum of digits in a given number n
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of digits of the given numbet is : " + sum);
        sc.close();
    }
}
