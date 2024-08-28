import java.util.*;

public class practise{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int length = arr.length;
        int store = peak(arr, length);
        System.out.print(arr[store]);
    }

    public static int peak(int[] arr, int n) {
        // If the array has only one element, return its index as the peak
        if (n == 1) {
            return 0;
        }

        // If the first element is greater than or equal to the second
        if (arr[0] >= arr[1]) {
            return 0;
        }

        // If the last element is greater than or equal to the second last
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        // Check the middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        // Fallback (though it should never be reached with valid input)
        return -1;
    }
}
