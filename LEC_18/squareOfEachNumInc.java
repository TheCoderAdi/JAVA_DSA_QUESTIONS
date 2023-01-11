public class squareOfEachNumInc {
    public static void main(String[] args) {
        // In this question the given array is in non-decreasing manner
        int arr[] = { -10, -8, -2, 1, 4, 5 };
        int n = arr.length;
        int ans[] = new int[n];

        int left = 0;
        int right = n - 1;

        int k = n - 1;

        // Finding the reuried array
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }

        for (int i : ans)
            System.out.print(i + " ");
    }
}
