public class Q8 {
    public static void main(String[] args) {
        /*
         * 121212
         * 212121
         * 121212
         * 212121
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
