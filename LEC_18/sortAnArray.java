public class sortAnArray {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0 };

        int n = arr.length;

        // 1sr Method
        // int count = 0;
        // for (int i : arr) {
        // if (i == 0)
        // count++;
        // }

        // for (int i = 0; i < n; i++) {
        // if (i < count) {
        // arr[i] = 0;
        // } else {
        // arr[i] = 1;
        // }
        // }

        // Optimised Method
        int first = 0;
        int last = n - 1;

        while (first < last) {
            if (arr[first] == 1 && arr[last] == 0) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            if (arr[first] == 0)
                first++;
            if (arr[last] == 1)
                last--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}