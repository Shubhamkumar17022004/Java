import java.util.Scanner;

public class ArrayNewElement {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size + 1]; // Increased size by 1 for the new element

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        // Display the entered elements
        System.out.println("Your entered elements are:");
        for (int j = 0; j < size; j++) {
            System.out.println("Element at index " + j + ": " + arr[j]);
        }

        // Get the index and value for the new element
        System.out.println("Enter the index where you want to add the new element:");
        int index = sc.nextInt();

        System.out.println("Enter the value of the new element:");
        int value = sc.nextInt();

        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element at the specified index
        arr[index] = value;

        // Display the final array with the new element
        System.out.println("The array after inserting the new element:");
        for (int i = 0; i < size + 1; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Close the scanner
        sc.close();
    }
}
