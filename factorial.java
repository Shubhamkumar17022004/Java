import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,store=1;
        System.out.println("enter the no to find its factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        // System.out.println(n);
        for(int i=1;i<=n;i++)
        {
            store=store*i;
        }
        System.out.println(store);
    }
}
