import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Find the sum of the following digit
        // 1 - 2 + 3 - 4 .....n
        int lastNum, sumOfN = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to add and substract ");
        lastNum = sc.nextInt();

        for (int i = 1; i <= lastNum; i++) {
            if (i % 2 == 0) {
                sumOfN -= i;
            } else {
                sumOfN += i;
            }
        }
        System.out.println("The sum of the series is : " + sumOfN);
        sc.close();
    }
}
