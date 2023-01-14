import java.util.Scanner;

public class arrrayOneBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the lenght of the array : ");
        n = sc.nextInt();

        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        System.out.println("Enter the number of the queries : ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = arr[r] - arr[l - 1];
            System.out.println("The sum of the number in the range is : " + ans);
        }

        sc.close();
    }
}
