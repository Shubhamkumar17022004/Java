import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
          System.out.println("Enter the element of array") ;
          arr[i]=sc.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}