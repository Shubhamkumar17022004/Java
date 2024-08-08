import java.util.Scanner;

public class factorof_number {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Factorial of a number is"+i);
            }
        }
    }
}
