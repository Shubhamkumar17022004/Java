import java.util.Scanner;

public class cooping {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of item you want to enter");
        size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            System.out.println("elemnt you store" + arr[i]);
        }

        for (int j = 0; j < size; j++) {
            System.out.println("Elemnt in array one" + arr[j]);
        }

        int arr2[] = new int[size];
        System.arraycopy(arr, 0, arr2, 0, size);

        // Printing the elements of the copied array
        System.out.println("The elements of the copied array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
