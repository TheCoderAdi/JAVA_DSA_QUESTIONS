import java.util.Scanner;

public class swapWithoutTemp {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.println("Before swapping the values ->");
        System.out.println("First number is : " + num1);
        System.out.println("Second number is : " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping the values ->");
        System.out.println("First number is : " + num1);
        System.out.println("Second number is : " + num2);

        sc.close();
    }
}
