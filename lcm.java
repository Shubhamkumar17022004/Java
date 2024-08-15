import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter the two number to find the lcm");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        int store=(n1>n2)?n1:n2;
        while(true)
        {
            if(store%n1==0 && store%n2==0)
            {
                break;
            }
            store++;
        }
        System.out.println(store);
    }
}
