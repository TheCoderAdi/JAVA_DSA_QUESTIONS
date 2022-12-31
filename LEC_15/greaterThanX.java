public class greaterThanX {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 23, 34, 2, 1, 2, 3 };
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
