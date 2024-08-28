
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class quest_5 {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of an element");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int tar;
        System.out.println("Enter the value of sum");
        tar=sc.nextInt();
        int sum=0;

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                sum=arr[i]+arr[j];

                if(sum==tar)
                {
                    System.out.println(+arr[i] + " " +arr[j]);
                }
            }
        }
    }
}
