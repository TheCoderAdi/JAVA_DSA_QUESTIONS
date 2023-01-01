public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 231, 12, 23, 25 };
        int largestEle = arr[0], secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largestEle < arr[i]) {
                secondLargest = largestEle;
                largestEle = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest number is : " + secondLargest);
        System.out.println("The  largest number is : " + largestEle);
    }
}
