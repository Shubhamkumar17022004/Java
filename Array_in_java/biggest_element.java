import java.util.Scanner;

public class biggest_element {
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
        int temp=arr[0];
        // int index;
        for(int k=0;k<size;k++)
        {
            if(arr[k]>temp)
            {
                temp=arr[k];
            }
        }
        System.out.println(temp);
    }
}