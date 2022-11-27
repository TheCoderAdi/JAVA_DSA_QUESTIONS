import java.util.Scanner;

public class Q1_Using_For_Loop {
    public static void main(String[] args) {

        int n, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        // using for loop
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of the number is(using for loop) : " + sum);

        sc.close();

    }
}
