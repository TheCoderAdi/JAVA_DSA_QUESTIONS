import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Factorial of a given number
        int num, factorialOfN = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorialOfN *= i;
        }
        System.out.println("The factorial of the given number is : " + factorialOfN);
        sc.close();
    }
}
