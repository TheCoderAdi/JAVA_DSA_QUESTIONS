public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // int ans[] = new int[arr.length];
        // int j = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // ans[j++] = arr[i];
        // }
        // for (int i : ans) {
        // System.out.print(i + " ");
        // }
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
