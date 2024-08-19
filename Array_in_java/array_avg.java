import java.util.Scanner;

public class array_avg {
    public static void main(String[] args) {
        int size,sum=0;
        float avg;
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
            sum=sum+arr[j];
        }
        
        avg=sum/size;
        System.out.println(avg);
    }
}
