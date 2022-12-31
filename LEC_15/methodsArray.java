
// import java.lang.reflect.Array;
import java.util.*;

public class methodsArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 2, 1, 3 };
        System.out.println("Original array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // To clone a array to another varibale you can use .clone method
        int cloneArr[] = arr.clone();
        System.out.println("Clone the original array");
        for (int i : cloneArr) {
            System.out.print(i + " ");
        }
        System.out.println("\nCopying an array");
        // If you want to copy an array , you can use .copyOf() method of array
        int copyOfArr[] = Arrays.copyOf(arr, arr.length);
        // The first parameter is the array you want to copy and
        // second is the lenght of the array

        for (int i : copyOfArr) {
            System.out.print(i + " ");
        }

        // If you want to copy the array in the range you can use
        // copyOfRange(array[],firstIndex,lasIndex)
        // -> firstIndex and lastIndex is you choice but remember it will go from
        // lastIndex-1

        int rangeOfArr[] = Arrays.copyOfRange(arr, 2, 6);
        System.out.println("\nCopying in a range :");
        for (int i : rangeOfArr) {
            System.out.print(i + " ");
        }
    }
}