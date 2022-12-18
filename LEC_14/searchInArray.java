public class searchInArray {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 34, 5, 6, 6, 7 };
        int flag = 1; // It is just for checking that the value is exists or not
        // Suppose our x = 2 and we are checking the value is exists in the array or not
        // If exists returns exist or vise versa
        int x = 6;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                System.out.println("Found " + x + " at index : " + i);
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("-1");
        }
    }
}