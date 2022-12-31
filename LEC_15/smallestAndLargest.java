import java.util.Arrays;

public class smallestAndLargest {
    static int[] smallestAndLargestCheck(int arr[]) {

        // You can use this method also NO issues
        // int ans[] = new int[2];
        // int smallEle = arr[0], largeEle = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (largeEle < arr[i]) {
        // largeEle = arr[i];
        // ans[1] = largeEle;
        // } else if (smallEle > arr[i]) {
        // smallEle = arr[i];
        // ans[0] = smallEle;
        // }
        // }

        // 2nd method
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 1, 3, 6, 2 };
        for (int i : smallestAndLargestCheck(arr)) {
            System.out.print(i + " ");
        }
    }
}
