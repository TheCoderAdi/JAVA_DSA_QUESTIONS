import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :");
        int binaryNum = sc.nextInt();

        int ans = 0, power = 1;

        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            ans += (unitDigit * power);
            binaryNum /= 10;
            power *= 2;
        }
        System.out.println("The decimal number is : " + ans);
        sc.close();
    }

}