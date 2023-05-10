import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] myArray = {3, 7, 1, 0, 2, 10};

        System.out.print("Original array :");
        for (int j : myArray)
            System.out.print(" " + j);
        System.out.println();

        Arrays.sort(myArray);
        System.out.print("Sorted array :");
        for (int j : myArray)
            System.out.print(" " + j);
    }
}
