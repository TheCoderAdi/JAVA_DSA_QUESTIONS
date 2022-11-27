public class Q4 {
    public static void main(String[] args) {
        // Print all the values between 1 and 50 expect the multiple of 3
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
