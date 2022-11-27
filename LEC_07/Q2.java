import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Sum the numbers until the user enters -1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int sum = 0;
        while (num != -1) {
            sum += num;
            System.out.println("Enter the number to add until you enter -1 ");
            num = sc.nextInt();
        }
        System.out.println("The sum of the number is : " + sum);
        sc.close();
    }
}
