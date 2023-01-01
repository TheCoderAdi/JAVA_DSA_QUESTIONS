public class rotateWithoutExtraSpace {

    static void reverseArr(int arr[], int start, int last) {

        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;

        int n = arr.length;
        k = k % n;
        reverseArr(arr, 0, n - k - 1);
        reverseArr(arr, n - k, n - 1);
        reverseArr(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
