import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        int size, temp;

        // Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the number of elements in the array:");
        size = sc.nextInt();

        // Create the array and fill it with user input
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the element for index " + i + ":");
            arr[i] = sc.nextInt();
        }

        // Sort the array in descending order using Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1] for descending order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("The elements in descending order are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
