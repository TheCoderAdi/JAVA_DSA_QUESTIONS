public class sortedOrNot {
    static boolean checkSorted(int arr[]) {
        boolean flag = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        boolean check = checkSorted(arr);
        if (check)
            System.out.println("The array is sorted");
        else
            System.out.println("It is not sorted");
    }
}
