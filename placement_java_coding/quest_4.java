import java.util.Arrays;
import java.util.Scanner;

public class quest_4 {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of an element");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        call(size);
    }

    public static void call(int size) {
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            System.out.print("Enter the element");
            Scanner scc = new Scanner(System.in);
            arr[i] = scc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int n;
        System.out.println("Enter the value of k");
        Scanner sccc=new Scanner(System.in);
         n=sccc.nextInt();
         for(int i=n-1;i>=0;i--)
         {
            System.out.println((arr[i]));
         }
    }

}
