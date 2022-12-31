public class countTheElement {
    static int occuranceOfElememt(int arr[], int num) {
        int count = 0;

        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 23, 34, 2, 1, 2, 3, 45, 2, 2 };
        // Lets find the occurance of 2 in the array
        int ele = 2;

        int timesOfOcuurance = occuranceOfElememt(arr, ele);

        System.out.println("The number " + ele + " occured " + timesOfOcuurance + " in the array");

    }
}
