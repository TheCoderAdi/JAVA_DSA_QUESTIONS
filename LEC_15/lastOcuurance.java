public class lastOcuurance {
    public static void main(String[] args) {
        int arr[] = { 1, 23, 4, 2, 1, 12 };
        int element = 1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                lastIndex = i;
        }
        if (lastIndex == -1)
            System.out.println("There is no matched number in the array");
        else
            System.out.println("The last occurance of the given number " + element + " is : " + lastIndex);
    }
}
