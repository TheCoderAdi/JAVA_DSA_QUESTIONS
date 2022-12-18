public class sumArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The sum of all elements in array is : " + sum);
    }
}
