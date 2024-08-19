import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the array of size");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The length of the array is: " + arr.length);
    }
}
