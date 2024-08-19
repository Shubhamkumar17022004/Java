import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        int size, sum = 0;
        System.out.println("Enter the element size");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("please enter the element");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            System.out.println("your enter elements are" +  " " + arr[j]);
            sum=sum+arr[j];
        }
        System.out.println("sum of array elemnt are" + " " + sum);

    }
}
