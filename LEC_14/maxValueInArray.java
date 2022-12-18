public class maxValueInArray {
    public static void main(String[] args) {
        int[] nums = { 89, 1, 2, 3, 4, 5, 90 };
        int maxNum = 0;

        // Using for loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        // Using for each loop
        // for (int i : nums) {
        // if (maxNum > i) {
        // continue;
        // }
        // maxNum = i;
        // }
        System.out.println("The maximum element in the array : " + maxNum);
    }
}
