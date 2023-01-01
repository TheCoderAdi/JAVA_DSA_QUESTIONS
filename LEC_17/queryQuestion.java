import java.util.Scanner;

public class queryQuestion {
    static int[] freqArr(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 30, 12 };
        int freq[] = freqArr(arr);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of queries");
        int q = sc.nextInt();

        while (q != 0) {
            System.out.print("Enter the number to be searched ");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
        sc.close();
    }
}
