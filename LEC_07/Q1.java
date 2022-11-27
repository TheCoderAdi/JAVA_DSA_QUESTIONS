import java.util.*;

class Q1 {
    public static void main(String[] args) {
        // Sum of n Natural Numbers
        int n, sum = 0, num = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        // using while loop
        while (num <= n) {
            sum = sum + num;
            num++;
        }

        System.out.println("The sum of the number is(using while loop) : " + sum);
        sc.close();
    }
}