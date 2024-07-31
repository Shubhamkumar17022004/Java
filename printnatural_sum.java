import java.util.*;

public class printnatural_sum {
    public static void main(String args[])
    {
        int sum=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last no to find its sum");
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            
           sum=sum+i;
        }
       System.out.print(sum);
    }
}
