import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps you want to rotate");
        int k = sc.nextInt();
        k = k % n;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
