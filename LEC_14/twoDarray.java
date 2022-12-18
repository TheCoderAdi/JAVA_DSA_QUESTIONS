public class twoDarray {
    public static void main(String[] args) {
        int[][] array = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {// Or you can use array.lenght-1 in place of array[i].lenght
                System.out.print(array[i][j]);
            }
        }
    }
}
