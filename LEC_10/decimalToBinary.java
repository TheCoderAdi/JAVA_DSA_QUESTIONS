import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int decimalNumber = sc.nextInt();
        int ans = 0;

        int power = 1;

        while (decimalNumber > 0) {
            int parity = decimalNumber % 2;
            ans += (parity * power);
            power *= 10;
            decimalNumber /= 2;

        }
        System.out.println("The binary number is : " + ans);
        sc.close();

    }
}
