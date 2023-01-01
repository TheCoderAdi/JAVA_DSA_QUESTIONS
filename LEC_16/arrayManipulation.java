public class arrayManipulation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 4, 5, 4 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                ans = arr[i];
        }

        System.out.println("So the answer is : " + ans);

    }
}
