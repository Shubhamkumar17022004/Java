import java.util.Scanner;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];

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

        // Get the index of the element to be deleted
        System.out.println("Enter the index of the element you want to delete:");
        int index = sc.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index! No element deleted.");
        } else {
            // Shift elements to the left to overwrite the deleted element
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Reduce the size of the array to reflect the deletion
            size--;

            // Display the final array after deletion
            System.out.println("The array after deleting the element:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        }

        // Close the scanner
        sc.close();
    }
}
