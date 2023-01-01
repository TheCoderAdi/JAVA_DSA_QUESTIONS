public class targetSum {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 5, 2, 8 };
        int target = 7, totalPair = 0;
        // It is the brute force solution , In the upcomming lecture we will be writing
        // efficient methods
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    totalPair++;
            }
        }
        System.out.println("The total pair present in the array is : " + totalPair);
    }
}