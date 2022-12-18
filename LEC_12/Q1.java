import java.util.Scanner;

/*
 * Add two numbers using java methods
 */

//2nd Method 
class Algebra {
    int add(int a, int b) {
        return a + b;
    }
}

public class Q1 {
    // 1st method
    // static int addNumber(int a, int b) {
    // return a + b;
    // }

    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        // sum = addNumber(num1, num2);//Method 1 Sum
        sum = obj.add(num1, num2);

        System.out.println("The sum of the two number is : " + sum);
        sc.close();

    }

}