import java.util.Arrays;

public class task2 {
    /*
Implement the method that takes a two-dimensional array and return the single-dimensional array with all elements of the given array
({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6}
*/
    public static void main(String[] args) {
        int[][] array = new int[][]{ // declaring array
                {1, 2},
                {3, 4},
                {5, 6, 7}
        };

        print(new1dArray(newArrayLength(array),array)); // calling for methods

    }

    public static int newArrayLength(int[][] array) { // method for finding new array total length
        int totalLength = 0;
        for (int i = 0; i < array.length; i++) { // loop to find every row length
            totalLength += array[i].length;
        }
        return totalLength;
    }

    public static int[] new1dArray(int totalLength, int[][] array) { // method to write all numbers from 2d array to 1d array
        int[] array1D = new int[totalLength]; // declaring 1d array length
        for (int i = 0, k = 0; i < array.length; i++) // loop to get columns
            for (int j = 0; j < array[i].length; j++, k++) // loop to get rows
                array1D[k] = array[i][j]; // assigning every number to new array

        return array1D;
    }

    public static void print(int[] array1D) { // method with loop to print new 1D array
        for (int m = 0; m < array1D.length; m++) {
            System.out.print(array1D[m] + "    ");
        }
    }
}
