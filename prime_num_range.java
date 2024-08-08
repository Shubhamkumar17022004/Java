import java.util.Scanner;

public class prime_num_range {
    public static void main(String[] args) {
        int a, b, i, j;
        System.out.println("Enter the range of number to find prime numbers between them");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = a; i <= b; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)

                    break;

            }
            if (i == j)
                System.out.println(j);
        }
    }
}
