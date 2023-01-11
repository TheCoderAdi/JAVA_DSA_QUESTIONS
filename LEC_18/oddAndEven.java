public class oddAndEven {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 8 };
        int n = arr.length;

        int first = 0;
        int last = n - 1;

        while (first < last) {
            if (arr[first] % 2 != 0 && arr[last] % 2 == 0) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            if (arr[first] % 2 == 0)
                first++;
            if (arr[last] % 2 != 0)
                last--;
        }

        for (int i : arr)
            System.out.print(i + " ");

    }
}
