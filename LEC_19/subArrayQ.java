public class subArrayQ {
    public static void main(String[] args) {
        // int arr[] = { 5, 3, 2, 6, 3, 1 };
        int arr[] = { 1, 1, 1, 1, 1, 1 };

        boolean flag = false;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = sum - prefixSum;
            if (prefixSum == suffixSum) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Can be divided");
        } else {
            System.out.println("Can't be divided");
        }
    }
}
