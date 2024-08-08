import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n,rem=0;
        System.out.println("Enter the number to reverse it");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        while (n!=0) {
         rem=n%10;
         System.out.print(rem);
        // rem=rem*10+no;
        n=n/10;
        }
        
    }
}
