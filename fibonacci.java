import java.util.*;
public class fibonacci
{
    public static void main(String[] args)
    {
        int terms,n1=0,n2=1;
        System.out.println("Enter the number of terms you want to print the fibonacci");
        Scanner sc=new Scanner(System.in);
        terms=sc.nextInt();
        System.out.print(n1 + " " + n2);
        for(int i=2;i<=terms;i++)
        {
        int next = n1 + n2;
        System.out.print(" "+ next);
        n1=n2;
        n2=next;
        }   
        System.out.println();
    }
}