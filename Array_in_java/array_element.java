import java.util.Scanner;

public class array_element {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the element of an array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("please enter the element");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            System.out.println("your enter elements in arr index" + " " + j + " " + arr[j]);
        }

        System.out.println("Enter the element index to se that particular element");
        Scanner scc= new Scanner(System.in);
        int index=scc.nextInt();
        if(index>=0 && index<size)
        {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Invalid index. Please enter a value between 0 and " + (size - 1));
        }

    }
}
