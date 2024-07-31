import java.util.Scanner;

public class print_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number");
        int last = sc.nextInt();
        for(int i=1;i<=last;i++)
        {
            System.out.println(i);
        }
    }
}
