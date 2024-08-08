import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n, no, store = 0,temp;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp=n;
        while (n != 0) {
            no = n % 10;
            store = store + (no * no * no);
            n=n/10;
        }
        System.out.println(store);
        if(temp==store)
        {
            System.out.println("Arm");
        }
        else{
            System.out.println("not arm");
        }
    }
}
