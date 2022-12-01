import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Find a raised to the power b
        int a, b, ans = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        a = sc.nextInt();

        System.out.println("Enter the second number : ");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("a raised to power b is : " + ans);
        sc.close();
    }
}
