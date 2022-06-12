import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int[] arr = {-99, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30}; // declaring array
        System.out.println(Arrays.toString(minimalValue(arr))); // method calling and print result
    }
    public static int[] minimalValue(int[] arr) { //method for searching smallest value
        for (int a = 0; a < arr.length; a++) {
             int minIndex = a; // loop for going through array
            for (int i = a; i < arr.length; i++) { // loop for searching the smallest value of array
                if (arr[i] < arr[minIndex]) {
                    minIndex = i; // saving smallest values index
                }
            }
            swap(minIndex, arr, a); // calling method for swap values
        }
        return arr; // return sorted array
    }

    public static void swap(int minIndex, int[] arr, int a){ // method for swap arrays values
        int tmp=arr[a]; // saving left value
        arr[a]=arr[minIndex]; // changing left value with the smallest
        arr[minIndex]=tmp; // changing place of left value to the smallest values place
    }
}
