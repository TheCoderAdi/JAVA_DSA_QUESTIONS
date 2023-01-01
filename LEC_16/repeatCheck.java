public class repeatCheck {
    static int repeatCheckFirst(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 6, 3, 4 };
        int ans = repeatCheckFirst(arr);
        System.out.println("The first repeating element in the array is : " + ans);
    }
}
